package cn.rk6216.eureka_client_user_update8102.service;

import cn.rk6216.eureka_client_user_update8102.pojo.UserInfo;

import java.util.Map;

/**
 *  用户更新
 *  @author: Lizq
 *  @Date: 2020/4/15 17:57
 */
public interface IUserInfoService {

    /**
     *  更新用户, 需要有 user_id 作为条件和任意需要更新的值
     * @param
     * @return
    */
    String updateUserInfo(UserInfo userInfo);

    /**
     *  发送验证码到邮箱
     *  @author: Lizq
     *  @Date: 2020/4/15 21:37
     */
    // 通过 id
    String updateSendCheckByUserId(String userId);

    // 通过 邮箱
    String updateSendCheckByUserEmail(String userEmail);

    /**
     *  忘记密码验证后 修改密码
     *  @author: Lizq
     *  @Date: 2020/4/15 21:38
     */
    String updatePassword(Map<String,String> map);
}
