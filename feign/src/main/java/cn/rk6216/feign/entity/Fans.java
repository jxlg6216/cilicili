package cn.rk6216.feign.entity;

public class Fans {
    /**
    * 
    * 表字段: user_id
    */
    private String userId;

    /**
    * 
    * 表字段: fans_list_id
    */
    private String fansListId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFansListId() {
        return fansListId;
    }

    public void setFansListId(String fansListId) {
        this.fansListId = fansListId == null ? null : fansListId.trim();
    }
}