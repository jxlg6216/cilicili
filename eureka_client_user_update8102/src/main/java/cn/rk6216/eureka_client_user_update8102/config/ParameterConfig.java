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

    public static UserInfo updateMapConfig(Map<String, String> map) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(map.get("userId"));
        userInfo.setUserName(map.get("userName"));
        userInfo.setUserEmail(map.get("userEmail"));
        userInfo.setUserPhone(map.get("userPhone"));
        userInfo.setUserMark(map.get("userMark"));
        userInfo.setUserBirthday(map.get("userBirthday"));

        String gender = map.get("userGender");
        if(gender == null || gender.equals("")) {

        } else {
            userInfo.setUserGender(Integer.parseInt(gender));
        }
//        String password = map.get("password");

        return userInfo;
    }
}
