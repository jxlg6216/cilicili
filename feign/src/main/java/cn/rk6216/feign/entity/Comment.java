package cn.rk6216.feign.entity;

public class Comment {
    /**
    * 子评论ID
    * 表字段: plus_id
    */
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
    * 表字段: user_id
    */
    private String userId;

    public String getPlusId() {
        return plusId;
    }

    public void setPlusId(String plusId) {
        this.plusId = plusId == null ? null : plusId.trim();
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getPlusValue() {
        return plusValue;
    }

    public void setPlusValue(String plusValue) {
        this.plusValue = plusValue == null ? null : plusValue.trim();
    }

    public String getCommentUsername() {
        return commentUsername;
    }

    public void setCommentUsername(String commentUsername) {
        this.commentUsername = commentUsername == null ? null : commentUsername.trim();
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus == null ? null : commentStatus.trim();
    }

    public String getPlusTime() {
        return plusTime;
    }

    public void setPlusTime(String plusTime) {
        this.plusTime = plusTime == null ? null : plusTime.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}