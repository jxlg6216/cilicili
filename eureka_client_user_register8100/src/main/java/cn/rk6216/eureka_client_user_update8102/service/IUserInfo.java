package cn.rk6216.eureka_client_user_update8102.service;

import cn.rk6216.eureka_client_user_update8102.pojo.UserInfo;

/**
 *
 *  @author: Lizq
 *  @Date: 2020/4/15 16:57
 */
public interface IUserInfo {
    /**
     *  注册用户
     * @param
     * @return
    */
    String registerUserInfo(UserInfo userInfo);

    /**
     *  邮箱检查
     */
    Boolean testEmail(String email);
}
