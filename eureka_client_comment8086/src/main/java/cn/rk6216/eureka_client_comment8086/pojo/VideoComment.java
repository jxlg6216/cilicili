package cn.rk6216.eureka_client_comment8086.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class VideoComment implements Serializable {
    /**
    * 评论ID
    * 表字段: comment_id
    */
    private String commentId;

    /**
    * 视频ID
    * 表字段: video_id
    */
    private String videoId;

    /**
    * 评论内容
    * 表字段: comment_value
    */
    private String commentValue;

    /**
    * 评论发起者
    * 表字段: comment_username
    */
    private String commentUsername;

    /**
    * 评论状态(0、被删除1、正常 2、被举报)
    * 表字段: comment_status
    */
    private String commentStatus;

    /**
    * 评论时间
    * 表字段: comment_time
    */
    private String commentTime;

    /**
    * 位置时间
    * 表字段: location_time
    */
    private String locationTime;

    /**
    * 是否有子评论(0、没有1、有)
    * 表字段: ishave_comment
    */
    private String ishaveComment;

    /**
    * 评论点赞数
    * 表字段: comment_praise_count
    */
    private Integer commentPraiseCount;
    /**
     *
     * 表字段: comment_userid
     */
    private String commentUserid;

}