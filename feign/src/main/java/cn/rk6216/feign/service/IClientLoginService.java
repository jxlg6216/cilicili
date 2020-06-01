package cn.rk6216.feign.service;

import cn.rk6216.feign.entity.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client-login")
public interface IClientLoginService {

    String config = "/login";

    @RequestMapping(value = config + "/login")
    UserInfo login(@RequestParam("userId") String userId, @RequestParam("userPassword") String userPassword);

    @RequestMapping(value = config + "/loginE")
    UserInfo loginByEmail(@RequestParam("userEmail") String userEmail, @RequestParam("userPassword") String userPassword);
}
