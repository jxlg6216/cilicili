package cn.rk6216.entityandtools.pojo;

public class VideoInformation {
    /**
    * 视频ID
    * 表字段: video_id
    */
    private String videoId;

    /**
    * 视频标题
    * 表字段: video_title
    */
    private String videoTitle;

    /**
    * 视频简介
    * 表字段: video_introduction
    */
    private String videoIntroduction;

    /**
    * 视频作者
    * 表字段: video_author
    */
    private String videoAuthor;

    /**
    * 审核状态
    * 表字段: video_status
    */
    private String videoStatus;

    /**
    * 上传时间
    * 表字段: video_time
    */
    private String videoTime;

    /**
    * 所属分类
    * 表字段: video_type
    */
    private String videoType;

    /**
    * 点赞数量
    * 表字段: video_praise_count
    */
    private Integer videoPraiseCount;

    /**
    * 收藏数量
    * 表字段: video_collection_count
    */
    private Integer videoCollectionCount;

    /**
    * 判断是否是电视剧类型
    * 表字段: is_tv
    */
    private Boolean isTv;

    /**
    * 视频标题-2
    * 表字段: tv_name
    */
    private String tvName;

    /**
    * 多少p
    * 表字段: tv_length
    */
    private Integer tvLength;

    /**
    * 
    * 表字段: user_id
    */
    private String userId;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle == null ? null : videoTitle.trim();
    }

    public String getVideoIntroduction() {
        return videoIntroduction;
    }

    public void setVideoIntroduction(String videoIntroduction) {
        this.videoIntroduction = videoIntroduction == null ? null : videoIntroduction.trim();
    }

    public String getVideoAuthor() {
        return videoAuthor;
    }

    public void setVideoAuthor(String videoAuthor) {
        this.videoAuthor = videoAuthor == null ? null : videoAuthor.trim();
    }

    public String getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(String videoStatus) {
        this.videoStatus = videoStatus == null ? null : videoStatus.trim();
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime == null ? null : videoTime.trim();
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType == null ? null : videoType.trim();
    }

    public Integer getVideoPraiseCount() {
        return videoPraiseCount;
    }

    public void setVideoPraiseCount(Integer videoPraiseCount) {
        this.videoPraiseCount = videoPraiseCount;
    }

    public Integer getVideoCollectionCount() {
        return videoCollectionCount;
    }

    public void setVideoCollectionCount(Integer videoCollectionCount) {
        this.videoCollectionCount = videoCollectionCount;
    }

    public Boolean getIsTv() {
        return isTv;
    }

    public void setIsTv(Boolean isTv) {
        this.isTv = isTv;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName == null ? null : tvName.trim();
    }

    public Integer getTvLength() {
        return tvLength;
    }

    public void setTvLength(Integer tvLength) {
        this.tvLength = tvLength;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}