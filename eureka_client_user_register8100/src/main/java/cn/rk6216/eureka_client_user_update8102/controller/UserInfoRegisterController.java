package cn.rk6216.eureka_client_user_update8102.controller;

import cn.rk6216.eureka_client_user_update8102.config.ParameterConfig;
import cn.rk6216.eureka_client_user_update8102.pojo.UserInfo;
import cn.rk6216.eureka_client_user_update8102.service.IUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 *  注册 和 修改用户部分信息的 controller 接口
 *  @author: Lizq
 *  @Date: ` 18:39
 */
@RestController
public class UserInfoRegisterController {

    @Autowired
    public IUserInfo iUserInfo;

    @PostMapping("/register")
    public String userInfoRegister(@RequestBody Map<String, String> map) {
        UserInfo userInfo = ParameterConfig.registerMapConfig(map);
        if(iUserInfo.registerUserInfo(userInfo).equals("success")) {
            return userInfo.getUserId();
        } else {
            return "failed";
        }
    }

}
