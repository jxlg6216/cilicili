package cn.rk6216.feign.controller;

import cn.rk6216.feign.entity.UserInfo;
import cn.rk6216.feign.service.IClientLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ClientLoginController {

    @Autowired
    private IClientLoginService iClientLoginService;

    private static final String config = "/login";

    @RequestMapping(value = config + "/login")
    public UserInfo login(UserInfo userInfo) {
        return iClientLoginService.login(userInfo.getUserId(),userInfo.getUserPassword());
    }


    @RequestMapping(value = config + "/loginE")
    public UserInfo loginByEmail(UserInfo userInfo) {
        return iClientLoginService.loginByEmail(userInfo.getUserEmail(),userInfo.getUserPassword());
    }
}
