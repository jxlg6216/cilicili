package cn.rk6216.feign.entity;

public class News {
    /**
    * 动态ID
    * 表字段: news_id
    */
    private String newsId;

    /**
    * 视频ID
    * 表字段: video_id
    */
    private String videoId;

    /**
    * 图文ID
    * 表字段: picture_id
    */
    private String pictureId;

    /**
    * 动态状态（0、被删除，1、正常，2、被举报）
    * 表字段: news_status
    */
    private String newsStatus;

    /**
    * 动态发起者ID
    * 表字段: user_id
    */
    private String userId;

    /**
    * 动态发起者名字
    * 表字段: user_name
    */
    private String userName;

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId == null ? null : newsId.trim();
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId == null ? null : pictureId.trim();
    }

    public String getNewsStatus() {
        return newsStatus;
    }

    public void setNewsStatus(String newsStatus) {
        this.newsStatus = newsStatus == null ? null : newsStatus.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}