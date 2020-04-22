package cn.rk6216.eureka_client_comment8086.service;

import cn.rk6216.eureka_client_comment8086.pojo.VideoComment;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;
import java.util.Map;


/**
 *  视频评论接口
 *  @author: Lizq
 *  @Date: 2019/12/23 11:05
 */
public interface IVideoCommentService {

    /**
     * 新增视频评论，同时请求消息服务接口，新增提示消息
     * @param videoComment 视频评论实体类
     * @return String 运行结果
    */
    String saveVideoComment(VideoComment videoComment);

    /**
     * 级联删除视频评论及其子评论
     * @param commentId 视频评论Id
     * @return String 运行结果
    */
    String deleteVideoComment(String commentId);

    /**
     *  通过视频Id查询该视频下的当前页数的评论（排序方式，点赞多，时间早在前面）
     * @param video_id,pageNumber 视频Id,当前的页数
     * @return iPage<VideoComment>
    */
    IPage<VideoComment> findVideoComment(String video_id, int pageNumber);

    /**
     *  查询出所有的视频评论，用于弹幕显示
     * @param video_id
     * @return List<VideoComment>
    */
    List<VideoComment> findAllVideoComment(String video_id);

    /**
     *  输入一个List<HashMap<String,String>> HashMap里存入 视频ID 和 最新的点赞数量，批量更新视频点赞数
     * @param
     * @return
    */
    String updatePraiseCount(List<Map<String,Object>> list);

    /**
     * 输入一个map 含有 comment_id ，ishave_comment 参数
     * @param
     * @return
    */
    String updateIshaveComment(Map map);

    /**
     *  修改评论
     * @param
     * @return
    */
    String updateVideoComment(VideoComment videoComment);

    //举报模块待定
    //消息提示待定
}
