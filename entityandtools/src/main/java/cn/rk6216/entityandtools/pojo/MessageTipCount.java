package cn.rk6216.entityandtools.pojo;

public class MessageTipCount {
    /**
    * 用户名称
    * 表字段: user_ID
    */
    private String userId;

    /**
    * 新消息提示数量
    * 表字段: message_count
    */
    private Integer messageCount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }
}