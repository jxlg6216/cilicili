package cn.rk6216.feign.controller;

import cn.rk6216.feign.entity.Comment;
import cn.rk6216.feign.entity.VideoComment;
import cn.rk6216.feign.service.IEurekaClientCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class EurekaClientCommentController {

    private final static String config = "/comment";

    @Autowired
    private IEurekaClientCommentService iEurekaClientCommentService;

    @PostMapping(config + "/get-comment-message")
    @ResponseBody
    Map<String,Object> getCommentMessage(@RequestBody Map requestResult){
        return iEurekaClientCommentService.getCommentMessage(requestResult);
    }

    @GetMapping(config + "/video-comment/{video-id}")
    @ResponseBody
    List<VideoComment> getAllVideoComment(@PathVariable("video-id") String videoId){
        return iEurekaClientCommentService.getAllVideoComment(videoId);
    }


    @PostMapping(config + "/get-comment")
    @ResponseBody
    Map<String,Object> getComment(@RequestBody Map requestResult){
        return iEurekaClientCommentService.getComment(requestResult);
    }

    @PostMapping(config + "/save-video-comment")
    @ResponseBody
    String saveVideoComment(@RequestBody Map requestResult){
        return iEurekaClientCommentService.saveVideoComment(requestResult);
    }

    @PostMapping(config + "/save-comment")
    @ResponseBody
    String saveComment(@RequestBody Map requestResult){
        return iEurekaClientCommentService.saveComment(requestResult);
    }

    /**
     *  删除视频评论
     * @param commentId
     * @return
     */
    @GetMapping(config + "/delete-video-comment/{comment-id}")
    @ResponseBody
    String deleteVideoComment(@PathVariable("comment-id") String commentId){
        return iEurekaClientCommentService.deleteVideoComment(commentId);
    }

    /**
     *  删除子评论
     * @param
     * @return
     */
    @GetMapping(config + "/delete-comment/{plus-id}")
    @ResponseBody
    String deleteComment(@PathVariable("plus-id")String plusId){
        return iEurekaClientCommentService.deleteComment(plusId);
    }

    /**
     *  修改视频评论
     * @param
     * @return
     */
    @PostMapping(config + "/update-video-comment")
    @ResponseBody
    String updateVideoComment(@RequestBody VideoComment videoComment){
        return iEurekaClientCommentService.updateVideoComment(videoComment);
    }

    /**
     *  修改子视频评论
     * @param
     * @return
     */
    @PostMapping(config + "/update-comment")
    @ResponseBody
    String updateComment(@RequestBody Comment comment){
        return iEurekaClientCommentService.updateComment(comment);
    }

}

