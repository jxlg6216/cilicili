package cn.rk6216.eureka_client_comment.service.impl;

import cn.rk6216.eureka_client_comment.dao.CommentMapper;
import cn.rk6216.eureka_client_comment.pojo.Comment;
import cn.rk6216.eureka_client_comment.service.ICommentService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 子评论服务接口的实现类
 *  @author: Lizq
 *  @Date: 2019/12/23 15:37
 */
@Transactional
@Service
public class CommentServiceImpl implements ICommentService {

    @Resource
    private CommentMapper commentMapper;

    /**
     *  新增子评论，同时请求消息服务接口，新增提示消息
     * @param comment 实体对象
     * @return String 运行结果
     */
    @Override
    public String saveComment(Comment comment) {
        /* 向「消息提醒」微服务接口发起请求新增一条提醒记录 */

        /* 1、向数据库中新增一条记录 */
        int rows = commentMapper.insert(comment);
        if(rows==0)return "新增失败";
        else return "新增了："+rows+"条记录";
    }

    /**
     *  删除子评论
     * @param plusId 子评论的ID
     * @return String 运行结果
     */
    @Override
    public String deleteComment(String plusId) {
        /* 向数据库中删除一条记录 */
        LambdaQueryWrapper<Comment> lambdaQueryWrapper = Wrappers.<Comment>lambdaQuery();
        lambdaQueryWrapper.eq(Comment::getPlusId,plusId);
        int rows = commentMapper.delete(lambdaQueryWrapper);
        if(rows==0)return "删除失败";
        else return "删除了："+rows+"条记录";
    }

    /**
     *  剩下的评论是否大于 1
     * @param
     * @return
    */
    @Override
    public boolean isHasComment(String plusId) {
        if(commentMapper.isHasComment(plusId).length>1);
        return true;
    }

    /**
     *  通过视频评论ID查询出子评论，按最新时间的排在前面,加载更多的方式一次加载10条
     * @param commentId,pageNumber 视频评论的ID ,当前页数
     * @return IPage<Comment> 返回当前视频评论ID下的所有子评论
     */
    @Override
    public IPage<Comment> findCommentByCommentId(String commentId, int pageNumber) {
        QueryWrapper<Comment> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("comment_id",commentId).orderByDesc("plus_time");
        Page<Comment> page = new Page<>(pageNumber,10);
        IPage<Comment> iPage = commentMapper.selectPage(page,queryWrapper);
        return iPage;
    }

    /**
     *  通过 plusId 查询 commentId
     * @param
     * @return
     */
    @Override
    public String findCommentIdByPlusId(String plusId) {
        LambdaQueryWrapper<Comment> lambdaQueryWrapper = Wrappers.lambdaQuery();
        lambdaQueryWrapper.select(Comment::getCommentId).eq(Comment::getPlusId,plusId).select();
        return commentMapper.selectOne(lambdaQueryWrapper).getCommentId();
    }

    /**
     *  修改子评论
     * @param
     * @return
    */
    @Override
    public String updateComment(Comment comment) {
        LambdaQueryWrapper<Comment> lambdaQueryWrapper = Wrappers.lambdaQuery();
        lambdaQueryWrapper.eq(Comment::getPlusId,comment.getPlusId());
        int rows = commentMapper.update(comment,lambdaQueryWrapper);
        if(rows == 0) return "修改出错！";
        else return "修改成功："+rows+"条数据";
    }

}
