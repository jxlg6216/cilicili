package cn.rk6216.eureka_client_comment8086.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class Comment implements Serializable {
    /**
    * 子评论ID
    * 表字段: plus_id
    */
    @TableId
    private String plusId;

    /**
    * 评论ID
    * 表字段: comment_id
    */
    private String commentId;

    /**
    * 评论内容
    * 表字段: plus_value
    */
    private String plusValue;

    /**
    * 评论发起者名称
    * 表字段: comment_username
    */
    private String commentUsername;

    /**
    * 评论状态（0、被删除1、正常2、被举报）
    * 表字段: comment_status
    */
    private String commentStatus;

    /**
     *
     * 表字段: plus_time
     */
    private String plusTime;
    /**
     *
     * 表字段: comment_userid
     */
    private String commentUserid;
}