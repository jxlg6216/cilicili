package cn.rk6216.entityandtools.pojo;

public class Attention {
    /**
    * 用户ID
    * 表字段: user_id
    */
    private String userId;

    /**
    * 关注列表ID
    * 表字段: attention_list_id
    */
    private String attentionListId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAttentionListId() {
        return attentionListId;
    }

    public void setAttentionListId(String attentionListId) {
        this.attentionListId = attentionListId == null ? null : attentionListId.trim();
    }
}