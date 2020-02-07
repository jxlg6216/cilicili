package cn.rk6216.eureka_client_comment;

import cn.rk6216.eureka_client_comment.pojo.Comment;
import cn.rk6216.eureka_client_comment.pojo.VideoComment;
import cn.rk6216.eureka_client_comment.service.ICommentService;
import cn.rk6216.eureka_client_comment.service.IVideoCommentService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SpringBootTest
@RunWith(SpringRunner.class)
class EurekaClientCommentApplicationTests {

    @Autowired
    private ICommentService iCommentService;

    @Autowired
    private IVideoCommentService iVideoCommentService;

    @Test
    void testUpdateComment(){
        Comment comment = new Comment();
        comment.setPlusId("2");
        comment.setCommentStatus("1");
        System.out.println(iCommentService.updateComment(comment));
    }

    @Test
    void testFindCommentIdByPlusId(){
        System.out.println(iCommentService.findCommentIdByPlusId("1"));
    }

    @Test
    void testIsHasComment(){
        System.out.println(iCommentService.isHasComment("1"));
    }

    @Test
    void testdeleteComment(){
        System.out.println(iCommentService.deleteComment("4"));
    }

    @Test
    void testFindCommentByCommentId(){
        System.out.println(iCommentService.findCommentByCommentId("4",1).getRecords());
    }

    @Test
    void testSaveComment(){
        Comment comment = iCommentService.findCommentByCommentId("4",1).getRecords().get(0);
        comment.setPlusId("4");
        comment.setPlusTime("2019-11-11");
        System.out.println(iCommentService.saveComment(comment));
    }

    @Test
    void testFindAllVideoComment(){
        System.out.println(iVideoCommentService.findAllVideoComment("5"));
    }

    @Test
    void testFindVideoComment(){
        System.out.println(iVideoCommentService.findVideoComment("5",1).getRecords());
    }

    @Test
    void testDeleteVideoComment(){
        System.out.println(iVideoCommentService.deleteVideoComment("5"));
    }

    @Test
    void testSaveVideoComment(){
        VideoComment videoComment = iVideoCommentService.findVideoComment("5",1).getRecords().get(0);
        videoComment.setCommentId("5");
        System.out.println(iVideoCommentService.saveVideoComment(videoComment));
    }

    @Test
    void testUpdateIshaveComment(){
        Map map = new HashMap<>();
        map.put("comment_id","5");
        map.put("ishave_comment","0");
        System.out.println(iVideoCommentService.updateIshaveComment(map));
    }

    @Test
    void testUpdatePraiseCount(){
        List list = new ArrayList();
        Map map = new HashMap();
        map.put("commentId","5");
        map.put("commentPraiseCount",200);
        list.add(map);
        System.out.println(iVideoCommentService.updatePraiseCount(list));
    }

    @Test
    void testUpdateVideoComment(){
        VideoComment videoComment = iVideoCommentService.findVideoComment("1",1).getRecords().get(0);
        System.out.println(videoComment);
        videoComment.setCommentId("5");
        System.out.println(iVideoCommentService.updateVideoComment(videoComment));
    }

}
