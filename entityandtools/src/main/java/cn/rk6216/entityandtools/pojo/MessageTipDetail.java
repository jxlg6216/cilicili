package cn.rk6216.entityandtools.pojo;

public class MessageTipDetail {
    /**
    * 
    * 表字段: user_id
    */
    private String userId;

    /**
    * 
    * 表字段: message_id_array
    */
    private String messageIdArray;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMessageIdArray() {
        return messageIdArray;
    }

    public void setMessageIdArray(String messageIdArray) {
        this.messageIdArray = messageIdArray == null ? null : messageIdArray.trim();
    }
}