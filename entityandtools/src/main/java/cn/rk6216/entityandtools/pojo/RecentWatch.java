package cn.rk6216.entityandtools.pojo;

public class RecentWatch {
    /**
    * 
    * 表字段: user_id
    */
    private String userId;

    /**
    * 
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