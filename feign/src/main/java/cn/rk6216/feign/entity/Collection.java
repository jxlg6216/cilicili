package cn.rk6216.feign.entity;

public class Collection {
    /**
    * 用户ID
    * 表字段: user_id
    */
    private String userId;

    /**
    * 视频ID
    * 表字段: video_id_array
    */
    private String videoIdArray;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getVideoIdArray() {
        return videoIdArray;
    }

    public void setVideoIdArray(String videoIdArray) {
        this.videoIdArray = videoIdArray == null ? null : videoIdArray.trim();
    }
}