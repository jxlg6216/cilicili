package cn.rk6216.eureka_client_comment8086.service.impl;

import cn.rk6216.eureka_client_comment8086.dao.CommentMapper;
import cn.rk6216.eureka_client_comment8086.dao.VideoCommentMapper;
import cn.rk6216.eureka_client_comment8086.pojo.VideoComment;
import cn.rk6216.eureka_client_comment8086.service.IVideoCommentService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 视频评论服务接口的实现类
 *  @author: Lizq
 *  @Date: 2019/12/23 15:38
 */
@Transactional
@Service
public class VideoCommentServiceImpl implements IVideoCommentService {

    @Resource
    private VideoCommentMapper videoCommentMapper;

    @Resource
    private CommentMapper commentMapper;

    /**
     * 新增视频评论，同时请求消息服务接口，新增提示消息
     * @param videoComment 视频评论实体类
     * @return String 运行结果
     */
    @Override
    public String saveVideoComment(VideoComment videoComment) {
        int rows = videoCommentMapper.insert(videoComment);
        if(rows==0)return "新增失败";
        else return "新增了："+rows+"条记录";
    }

    /**
     * 级联删除视频评论及其子评论
     * @param commentId 视频评论Id
     * @return String 运行结果
     */
    @Override
    public String deleteVideoComment(String commentId) {
        LambdaQueryWrapper<VideoComment> lambdaQueryWrapper = Wrappers.lambdaQuery();
        lambdaQueryWrapper.eq(VideoComment::getCommentId,commentId);
        int rows = videoCommentMapper.delete(lambdaQueryWrapper);
        if(rows==0)return "删除失败！";
        else{
            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.eq("comment_id",commentId);
            /* 级联删除子评论 */
            int a = commentMapper.delete(queryWrapper);
            return "删除了："+rows+"条记录,级联删除了："+a+"条子评论";
        }
    }

    /**
     *  通过视频Id查询该视频下的当前页数的评论（排序方式，点赞多，时间早在前面），分页查询一次查10条
     * @param videoId,pageNumber 视频Id,当前的页数
     * @return iPage<VideoComment>
     */
    @Override
    public IPage<VideoComment> findVideoComment(String videoId, int pageNumber) {
        QueryWrapper<VideoComment> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("video_id",videoId).orderByDesc("comment_praise_count").orderByDesc("comment_time");
        Page<VideoComment> page = new Page<>(pageNumber,10);
        IPage<VideoComment> iPage = videoCommentMapper.selectPage(page,queryWrapper);
        return iPage;
    }

    /**
     *  查询出当前视频的所有视频评论，用于弹幕显示
     * @param video_id
     * @return List<VideoComment>
     */
    @Override
    public List<VideoComment> findAllVideoComment(String video_id) {
        LambdaQueryWrapper<VideoComment> lambdaQueryWrapper = Wrappers.lambdaQuery();
        lambdaQueryWrapper.eq(VideoComment::getVideoId,video_id);
        List<VideoComment> list = videoCommentMapper.selectList(lambdaQueryWrapper);
        return list;
    }

    /**
     *  输入一个List<HashMap<String,String>> HashMap里存入 视频ID 和 最新的点赞数量，批量更新视频点赞数
     * @param
     * @return
     */
    @Override
    public String updatePraiseCount(List<Map<String, Object>> list) {
        int sum=0;
        for (Map<String,Object> map:list) {
            videoCommentMapper.updateVideoCommentPraise((String)map.get("commentId"),(int)map.get("commentPraiseCount"));
            sum++;
        }
        return "总共有："+list.size()+"条数据需要更新"+"，成功更新点赞记录："+sum+"条";
    }

    /**
     * 输入一个map 含有 comment_id ，ishave_comment 参数
     * @param
     * @return
     */
    @Override
    public String updateIshaveComment(Map map) {
        UpdateWrapper<VideoComment> updateWrapper = new UpdateWrapper();
        updateWrapper.eq("comment_id",map.get("comment_id")).set("ishave_comment",map.get("ishave_comment"));
        int rows = (videoCommentMapper.update(null,updateWrapper));
        if(rows==0)return "更新失败";
        else return "更新条数"+rows+"条";
    }

    /**
     *  修改评论
     * @param
     * @return
     */
    @Override
    public String updateVideoComment(VideoComment videoComment) {
        LambdaQueryWrapper<VideoComment> lambdaQueryWrapper = Wrappers.lambdaQuery();
        lambdaQueryWrapper.eq(VideoComment::getCommentId,videoComment.getCommentId());
        int rows = videoCommentMapper.update(videoComment,lambdaQueryWrapper);
        if(rows == 0)return "更新失败";
        else return "更新了："+rows+"条";
    }

}
