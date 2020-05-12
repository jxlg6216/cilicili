package cn.rk6216.eureka_client_user_update8102.pojo;

import lombok.Data;

@Data
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
    private int vip;

    /**
     *  start_time
     */
    private String start_time;

}