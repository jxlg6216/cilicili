package cn.rk6216.eureka_client_comment8086.service;

import cn.rk6216.eureka_client_comment8086.pojo.Comment;
import com.baomidou.mybatisplus.core.metadata.IPage;



/**
 *  子评论服务接口
 *  @author: Lizq
 *  @Date: 2019/12/23 10:11
 */
public interface ICommentService {

    /**
     *  新增子评论，同时请求消息服务接口，新增提示消息
     * @param comment 实体对象
     * @return String 运行结果
    */
    String saveComment(Comment comment);

    /**
     *  删除子评论
     * @param plusId 子评论的ID
     * @return String 运行结果
    */
    String deleteComment(String plusId);

    /**
     *  子评论删除ID后判断，videoComment是否还有子评论
     * @param
     * @return
     */
    boolean isHasComment(String plusId);

    /**
     *  通过视频评论ID查询出子评论，加载更多的方式一次加载10条
     * @param commentId,pageNumber 视频评论的ID ,当前页数
     * @return IPage<Comment> 返回当前视频评论ID下的所有子评论
    */
    IPage<Comment> findCommentByCommentId(String commentId, int pageNumber);

    /**
     *  通过 plusId 查询 commentId
     * @param
     * @return
    */
    String findCommentIdByPlusId(String plusId);

    /**
     *  修改子评论
     * @param
     * @return
    */
    String updateComment(Comment comment);

    //举报接口（需要一张举报表，记录举报的相关信息和评论表视频表进行管理）
    //评论消息通知模块（这两点应该在其他模块中实现）
}
