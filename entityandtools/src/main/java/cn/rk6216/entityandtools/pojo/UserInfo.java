package cn.rk6216.entityandtools.pojo;

public class UserInfo {
    /**
    * 用户ID
    * 表字段: user_id
    */
    private String userId;

    /**
    * 用户名
    * 表字段: user_name
    */
    private String userName;

    /**
    * 用户密码
    * 表字段: user_password
    */
    private String userPassword;

    /**
    * 邮箱
    * 表字段: user_email
    */
    private String userEmail;

    /**
    * 验证码
    * 表字段: user_check
    */
    private String userCheck;

    /**
    * 性别
    * 表字段: user_gender
    */
    private Integer userGender;

    /**
    * 电话
    * 表字段: user_phone
    */
    private String userPhone;

    /**
    * 积分
    * 表字段: user_number
    */
    private Integer userNumber;

    /**
    * 当天登录情况
    * 表字段: is_login_today
    */
    private Boolean isLoginToday;

    /**
    * 签名
    * 表字段: user_mark
    */
    private String userMark;

    /**
    * 生日
    * 表字段: user_birthday
    */
    private String userBirthday;

    /**
    * 粉丝量
    * 表字段: fans_number
    */
    private Integer fansNumber;

    /**
    * 关注量
    * 表字段: attention_number
    */
    private Integer attentionNumber;

    /**
    * 用户状态（0、被封禁，1、正常，2、被举报）
    * 表字段: user_status
    */
    private Integer userStatus;

    /**
    * 
    * 表字段: user_vip
    */
    private String userVip;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserCheck() {
        return userCheck;
    }

    public void setUserCheck(String userCheck) {
        this.userCheck = userCheck == null ? null : userCheck.trim();
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public Boolean getIsLoginToday() {
        return isLoginToday;
    }

    public void setIsLoginToday(Boolean isLoginToday) {
        this.isLoginToday = isLoginToday;
    }

    public String getUserMark() {
        return userMark;
    }

    public void setUserMark(String userMark) {
        this.userMark = userMark == null ? null : userMark.trim();
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday == null ? null : userBirthday.trim();
    }

    public Integer getFansNumber() {
        return fansNumber;
    }

    public void setFansNumber(Integer fansNumber) {
        this.fansNumber = fansNumber;
    }

    public Integer getAttentionNumber() {
        return attentionNumber;
    }

    public void setAttentionNumber(Integer attentionNumber) {
        this.attentionNumber = attentionNumber;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserVip() {
        return userVip;
    }

    public void setUserVip(String userVip) {
        this.userVip = userVip == null ? null : userVip.trim();
    }
}