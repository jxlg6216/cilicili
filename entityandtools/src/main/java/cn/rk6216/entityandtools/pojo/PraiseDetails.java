package cn.rk6216.entityandtools.pojo;

public class PraiseDetails {
    /**
    * 用户名称
    * 表字段: user_name
    */
    private String userName;

    /**
    * 点赞ID（视频ID/评论ID都行）
    * 表字段: praise_id
    */
    private String praiseId;

    /**
    * 用户ID
    * 表字段: user_id
    */
    private String userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPraiseId() {
        return praiseId;
    }

    public void setPraiseId(String praiseId) {
        this.praiseId = praiseId == null ? null : praiseId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}