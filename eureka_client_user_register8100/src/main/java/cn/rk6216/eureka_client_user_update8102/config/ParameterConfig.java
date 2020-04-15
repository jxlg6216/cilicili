package cn.rk6216.eureka_client_user_update8102.config;

import cn.rk6216.eureka_client_user_update8102.pojo.UserInfo;
import cn.rk6216.eureka_client_user_update8102.utils.Md5;
import cn.rk6216.eureka_client_user_update8102.utils.RandomId;

import java.util.Map;

/**
 *  构造参数
 *  @author: Lizq
 *  @Date: 2020/4/15 18:40
 */
public class ParameterConfig {
    public static UserInfo registerMapConfig (Map<String, String> map) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(RandomId.getRandom12Id());
        userInfo.setUserName(map.get("userName"));
        userInfo.setUserPassword(Md5.md5(Md5.yh(map.get("userPassword"))));
        userInfo.setUserEmail(map.get("userEmail"));
        // 初始化设置为男生，之后可以修改
        userInfo.setUserGender(1);
        userInfo.setUserNumber(500);
        return userInfo;
    }
}
