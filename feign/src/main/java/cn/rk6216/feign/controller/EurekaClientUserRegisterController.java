package cn.rk6216.feign.controller;

import cn.rk6216.feign.service.IEurekaClientUserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
public class EurekaClientUserRegisterController {

    private static final String config = "/user-register";

    @Autowired
    private IEurekaClientUserRegisterService iEurekaClientUserRegisterService;

    @PostMapping(value = config + "/register")
    public String userInfoRegister(@RequestBody Map<String, String> map){
        return iEurekaClientUserRegisterService.userInfoRegister(map);
    }
}
