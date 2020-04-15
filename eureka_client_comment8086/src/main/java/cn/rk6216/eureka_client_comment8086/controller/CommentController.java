package cn.rk6216.eureka_client_comment8086.controller;

import cn.rk6216.eureka_client_comment8086.config.ParameterConfig;
import cn.rk6216.eureka_client_comment8086.pojo.Comment;
import cn.rk6216.eureka_client_comment8086.pojo.VideoComment;
import cn.rk6216.eureka_client_comment8086.service.ICommentService;
import cn.rk6216.eureka_client_comment8086.service.IVideoCommentService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  整个评论模块的 Controller，供其他模块进行访问
 *  @author: Lizq
 *  @Date: 2019/12/26 9:01
 */
@Controller
@Slf4j
public class CommentController {

    private Logger logger = LoggerFactory.getLogger(CommentController.class);

    @Autowired
    private IVideoCommentService iVideoCommentService;

    @Autowired
    private ICommentService iCommentService;

    @Autowired
    private ParameterConfig parameterConfig;

    /**
     *  获取当前视频的评论信息（进入视频页面初始化评论时调用）
     * @param requestResult 记录当前 pageNumber 和 videoId
     * @return 当前视频页数的评论信息
    */
    @PostMapping("/get-comment-message")
    @ResponseBody
    Map<String,Object> getCommentMessage(@RequestBody Map requestResult){
        logger.error("开始获取当前视频的评论信息《《《《《《《《《《《《《《《《《《《《《《《");
        String videoId = (String)requestResult.get("videoId");
        int pageNumber = Integer.parseInt((String)requestResult.get("pageNumber"));
        /* 1、获取视频评论信息 */
        IPage<VideoComment> iPage= iVideoCommentService.findVideoComment(videoId, pageNumber);
        Map map = parameterConfig.doCommentMessageResult(iPage.getPages(),iPage.getRecords());
        return map;
    }

    /**
     *  获取当前视频的所有视频评论，用于弹幕的显示
     * @param videoId
     * @return 所有视频评论的 List
    */
    @GetMapping("/video-comment/{video-id}")
    @ResponseBody
    List<VideoComment> getAllVideoComment(@PathVariable("video-id") String videoId){
        logger.error("开始获取当前视频的所有视频评论《《《《《《《《《《《《《《《《《《《");
        return iVideoCommentService.findAllVideoComment(videoId);
    }

    /**
     *  加载更多子评论（分页获取）
     * @param requestResult 记录当前 pageNumber 和 commentId
     * @return
     */
    @PostMapping("/get-comment")
    @ResponseBody
    Map<String,Object> getComment(@RequestBody Map requestResult){
        logger.error("开始加载更多子评论(分页获取)");
        String commentId = (String) requestResult.get("commentId");
        Integer pageNumber = Integer.parseInt((String)requestResult.get("pageNumber")) ;
        IPage<Comment> iPage = iCommentService.findCommentByCommentId(commentId,pageNumber);
        Map map = parameterConfig.doCommentResult(iPage.getPages(),iPage.getRecords(),pageNumber);
        return map;
    }

    /**
     *  新增视频评论信息（用户写视频评论信息调用）
     * @param requestResult 包含 videoId,commentValue,commentUsername,locationTime属性值
     * @return 成功新增多少数据
    */
    @PostMapping("/save-video-comment")
    @ResponseBody
    String saveVideoComment(@RequestBody Map requestResult){
        logger.error("开始新增视频评论信息《《《《《《《《《《《《《《《《《《《《《《《");
        VideoComment videoComment = parameterConfig.doSaveVideoCommentResult(requestResult);
        return iVideoCommentService.saveVideoComment(videoComment);
    }

    /**
     *  新增视频子评论信息(用户写子视频评论信息调用)
     * @param requestResult 包含 commentId,plusValue,commentUsername，ishaveComment
     * @return 成功新增多少数据
    */
    @PostMapping("/save-comment")
    @ResponseBody
    String saveComment(@RequestBody Map requestResult){
        logger.error("开始新增视频子评论信息《《《《《《《《《《《《《《《《《《《《");
        /* 如果视频评论的 ishave_comment 为 0（没有），将他置为 1 */
        Map map = new HashMap();
        map.put("commentId",requestResult.get("commentId"));
        map.put("ishaveComment","1");
        String result = iVideoCommentService.updateIshaveComment(map);
        logger.error(result);
        /* 构建参数进行新增 */
        result = iCommentService.saveComment(parameterConfig.doSaveCommentResult(requestResult));
        logger.error(result);
        return result;
    }

    /**
     *  删除视频评论
     * @param commentId
     * @return
    */
    @GetMapping("/delete-video-comment/{comment-id}")
    @ResponseBody
    String deleteVideoComment(@PathVariable("comment-id") String commentId){
        logger.error("开始删除视频评论《《《《《《《《《《《《《《《《《《《《《《《《《");
        String result = iVideoCommentService.deleteVideoComment(commentId);
        logger.error(result);
        return result;
    }

    /**
     *  删除子评论
     * @param
     * @return
    */
    @GetMapping("/delete-comment/{plus-id}")
    @ResponseBody
    String deleteComment(@PathVariable("plus-id")String plusId){
        logger.error("开始删除子评论《《《《《《《《《《《《《《《《《《《《《《《");
        if(iCommentService.isHasComment(plusId)){
            //do nothing
        }else{
            /* 没有子评论了，需要修改数据中视频评论的数据 */
            Map map = new HashMap();
            map.put("comment_id",iCommentService.findCommentIdByPlusId(plusId));
            map.put("ishave_comment","0");
            iVideoCommentService.updateIshaveComment(map);
        }
        return iCommentService.deleteComment(plusId);
    }

    /**
     *  修改视频评论
     * @param
     * @return
    */
    @PostMapping("/update-video-comment")
    @ResponseBody
    String updateVideoComment(@RequestBody VideoComment videoComment){
        logger.error("开始修改视频评论《《《《《《《《《《《《《《《《《《《《《《");
        String result = iVideoCommentService.updateVideoComment(videoComment);
        logger.error(result);
        return result;
    }

    /**
     *  修改子视频评论
     * @param
     * @return
    */
    @PostMapping("/update-comment")
    @ResponseBody
    String updateComment(@RequestBody Comment comment){
        logger.error("开始修改子视频评论《《《《《《《《《《《《《《《《《《《《《");
        String result = iCommentService.updateComment(comment);
        logger.error(result);
        return result;
    }
}
