package cn.rk6216.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient("euraka-client-user-register")
public interface IEurekaClientUserRegisterService {

    String config = "/user-register";

    @PostMapping(value = config + "/register")
    String userInfoRegister(@RequestBody Map<String, String> map);
}
