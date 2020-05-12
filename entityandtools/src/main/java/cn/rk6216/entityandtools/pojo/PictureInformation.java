package cn.rk6216.entityandtools.pojo;

public class PictureInformation {
    /**
    * 图文ID
    * 表字段: picture_id
    */
    private String pictureId;

    /**
    * 文字内容
    * 表字段: news_information
    */
    private String newsInformation;

    /**
    * 图片数量
    * 表字段: picture_number
    */
    private Integer pictureNumber;

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId == null ? null : pictureId.trim();
    }

    public String getNewsInformation() {
        return newsInformation;
    }

    public void setNewsInformation(String newsInformation) {
        this.newsInformation = newsInformation == null ? null : newsInformation.trim();
    }

    public Integer getPictureNumber() {
        return pictureNumber;
    }

    public void setPictureNumber(Integer pictureNumber) {
        this.pictureNumber = pictureNumber;
    }
}