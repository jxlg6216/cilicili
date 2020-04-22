package cn.rk6216.client_login8098.pojo;

import lombok.Data;

@Data
public class UserInfo {
    //用户账号
    private String userId;
    //用户密码
    private String userPassword;
    //用户邮箱
    private String userEmail;
    //user_check           varchar(20) comment '验证码',
    private String userCheck;
    //   user_gender          int comment '性别',
    private Integer userGender;
    //   user_phone           varchar(20) comment '电话',
    private String userPhone;
    //   user_number          int comment '积分',
    private Integer userNumber;
    //   is_login_today       boolean comment '当天登录情况',
    private Integer isLoginToday;
    //   user_mark            varchar(64) comment '签名',
    private String userMark;
    //   user_birthday        varchar(64) comment '生日',
    private String userBirthday;
    //   fans_number          int comment '粉丝量',
    private Integer fansNumber;
    //   attention_number     int comment '关注量',
    private Integer attentionNumber;
}
