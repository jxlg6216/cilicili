package cn.rk6216.eureka_client_comment8086.dao;

import cn.rk6216.eureka_client_comment8086.pojo.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;


/**
 *  子评论 dao 层接口
 *  @author: Lizq
 *  @Date: 2019/12/23 10:06
 */
public interface CommentMapper extends BaseMapper<Comment> {

    @Select("select plus_id from comment where comment_id = (select comment_id from comment where plus_id = #{plusId}) limit 2")
    String[] isHasComment(String plusId);
}