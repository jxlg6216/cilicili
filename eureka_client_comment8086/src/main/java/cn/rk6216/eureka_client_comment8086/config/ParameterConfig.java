package cn.rk6216.eureka_client_comment8086.config;

import cn.rk6216.eureka_client_comment8086.pojo.Comment;
import cn.rk6216.eureka_client_comment8086.pojo.VideoComment;
import cn.rk6216.eureka_client_comment8086.service.ICommentService;
import cn.rk6216.eureka_client_comment8086.utils.RandomId;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *  固定请求/接收参数的组件类
 *  @author: Lizq
 *  @Date: 2019/12/26 11:50
 */
@Component
public class ParameterConfig {

    @Autowired
    private ICommentService iCommentService;

    /**
     *  构建当前视频评论信息的返回参数
     * @param maxPageNumber,videoCommentList 最大页数，和视频评论结果集
     * @return map 拼装好了的
     */
    public Map<String,Object> doCommentMessageResult(long maxPageNumber, List<VideoComment> videoCommentList){
        Map<String,Object> result = new HashMap();
        result.put("maxPageNumber",maxPageNumber);
        List<Map> list = new ArrayList();
        List empty = new ArrayList();
        for (VideoComment videoComment:videoCommentList) {
            Map<String,Object> tmp = new HashMap<>();
            tmp.put("videoComment",videoComment);
            if (videoComment.getIshaveComment().equals("1")){
                IPage<Comment> comment = iCommentService.findCommentByCommentId(videoComment.getCommentId(), 1);
                tmp.put("comment",comment.getRecords());
                if(comment.getPages()>1){
                    tmp.put("isMore","1");
                }
                else {
                    tmp.put("isMore","0");
                }
            }
            else{
                tmp.put("comment",empty);
                tmp.put("isMore","0");
            }
            list.add(tmp);
        }
        result.put("commentMessage",list);
        return result;
    }

    /**
     *  构建当前视频评论信息的返回参数
     * @param
     * @return
    */
    public Map<String,Object> doCommentResult(long maxPageNumber,List<Comment> commentList,long nowPage){
        Map<String,Object> result = new HashMap();
        if(maxPageNumber>nowPage){ result.put("isMore","1"); }
        else{result.put("isMore","0");}
        List<Map> list = new ArrayList();
        List empty = new ArrayList();
        for (Comment comment:commentList) {
            Map<String,Object> tmp = new HashMap<>();
            tmp.put("comment",comment);
            list.add(tmp);
            }
        result.put("comments",list);
        return result;
    }

    /**
     *  构建新增视频评论的请求，将参数转换为实体类
     * @param map
     * @return VideoComment
    */
    public VideoComment doSaveVideoCommentResult(Map map){
        VideoComment videoComment = new VideoComment();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        videoComment.setVideoId((String) map.get("videoId"));
        videoComment.setCommentValue((String) map.get("commentValue"));
        videoComment.setLocationTime((String) map.get("locationTime"));
        videoComment.setCommentUsername((String) map.get("commentUsername"));
        videoComment.setCommentId(RandomId.getRandom20Id());
        videoComment.setCommentStatus("1");
        videoComment.setCommentTime(df.format(new Date()));
        videoComment.setIshaveComment("0");
        return videoComment;
    }

    /**
     *  构建新增子评论的请求，将参数转换为实体类
     * @param  map 包含 commentId,plusValue,commentUsername
     * @return
    */
    public Comment doSaveCommentResult(Map map){
        Comment comment = new Comment();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        comment.setCommentId((String) map.get("commentId"));
        comment.setPlusValue((String) map.get("plusValue"));
        comment.setCommentUsername((String) map.get("commentUsername"));
        comment.setPlusTime(simpleDateFormat.format(new Date()));
        comment.setCommentStatus("1");
        comment.setPlusId(RandomId.getRandom20Id());
        return comment;
    }
}
