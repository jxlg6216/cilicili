package cn.rk6216.feign.service;

import cn.rk6216.feign.entity.Comment;
import cn.rk6216.feign.entity.VideoComment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 *
 *  @author: Lizq
 *  @Date: 2019/12/24 9:04
 */
@FeignClient(value = "euraka-client-comment8086")
public interface IEurekaClientCommentService {

    String config = "/comment";

    @PostMapping(config + "/get-comment-message")
    @ResponseBody
    Map<String,Object> getCommentMessage(@RequestBody Map requestResult);

    @GetMapping(config + "/video-comment/{video-id}")
    @ResponseBody
    List<VideoComment> getAllVideoComment(@PathVariable("video-id") String videoId);


    @PostMapping(config + "/get-comment")
    @ResponseBody
    Map<String,Object> getComment(@RequestBody Map requestResult);

    @PostMapping(config + "/save-video-comment")
    @ResponseBody
    String saveVideoComment(@RequestBody Map requestResult);

    @PostMapping(config + "/save-comment")
    @ResponseBody
    String saveComment(@RequestBody Map requestResult);

    @GetMapping(config + "/delete-video-comment/{comment-id}")
    @ResponseBody
    String deleteVideoComment(@PathVariable("comment-id") String commentId);

    @GetMapping(config + "/delete-comment/{plus-id}")
    @ResponseBody
    String deleteComment(@PathVariable("plus-id")String plusId);

    @PostMapping(config + "/update-video-comment")
    @ResponseBody
    String updateVideoComment(@RequestBody VideoComment videoComment);

    @PostMapping(config + "/update-comment")
    @ResponseBody
    String updateComment(@RequestBody Comment comment);
}
