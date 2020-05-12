package cn.rk6216.entityandtools.pojo;

public class VideoComment {
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
    * 表字段: user_id
    */
    private String userId;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getCommentValue() {
        return commentValue;
    }

    public void setCommentValue(String commentValue) {
        this.commentValue = commentValue == null ? null : commentValue.trim();
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

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime == null ? null : commentTime.trim();
    }

    public String getLocationTime() {
        return locationTime;
    }

    public void setLocationTime(String locationTime) {
        this.locationTime = locationTime == null ? null : locationTime.trim();
    }

    public String getIshaveComment() {
        return ishaveComment;
    }

    public void setIshaveComment(String ishaveComment) {
        this.ishaveComment = ishaveComment == null ? null : ishaveComment.trim();
    }

    public Integer getCommentPraiseCount() {
        return commentPraiseCount;
    }

    public void setCommentPraiseCount(Integer commentPraiseCount) {
        this.commentPraiseCount = commentPraiseCount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}