package cn.rk6216.feign.entity;

import java.io.Serializable;

public class VideoInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    private String videoId;

    private String videoTitle;

    private String videoIntroduction;

    private String videoAuthor;

    private String videoStatus;

    private String videoTime;

    private Integer vidoePraiseCount;

    private Integer videoCollectionCount;

    private String videoType;

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

    public Integer getVidoePraiseCount() {
        return vidoePraiseCount;
    }

    public void setVidoePraiseCount(Integer vidoePraise) {
        this.vidoePraiseCount = vidoePraise;
    }

    public Integer getVideoCollectionCount() {
        return videoCollectionCount;
    }

    public void setVideoCollectionCount(Integer videoCollections) {
        this.videoCollectionCount = videoCollections;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType == null ? null : videoType.trim();
    }
}