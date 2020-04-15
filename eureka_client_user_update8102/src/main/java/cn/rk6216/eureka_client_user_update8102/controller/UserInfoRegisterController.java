package cn.rk6216.eureka_client_user_update8102.controller;

import cn.rk6216.eureka_client_user_update8102.config.ParameterConfig;
import cn.rk6216.eureka_client_user_update8102.service.IMailService;
import cn.rk6216.eureka_client_user_update8102.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 *  注册 和 修改用户部分信息的 controller 接口
 *  @author: Lizq
 *  @Date: ` 18:39
 */
@RestController
public class UserInfoRegisterController {

    @Autowired
    public IUserInfoService iUserInfoService;

    @Autowired
    public IMailService iMailService;

    @PostMapping("/update")
    public String userInfoUpdate(@RequestBody Map<String, String> map) {
        return iUserInfoService.updateUserInfo(ParameterConfig.updateMapConfig(map));
    }

    @GetMapping("/send-forget-email")
    public void sendForgetEmail(@RequestParam("userEmail") String userEmail,@RequestParam("userId") String userId) {
        iUserInfoService.updateSendCheck(userEmail, userId);
    }

    @PostMapping("/update-password")
    public String updatePassword(@RequestBody Map<String,String> map){
        return iUserInfoService.updatePassword(map);
    }

}
