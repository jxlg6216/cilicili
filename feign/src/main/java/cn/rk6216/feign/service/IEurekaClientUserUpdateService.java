package cn.rk6216.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("euraka-user-info-update")
public interface IEurekaClientUserUpdateService {

    String config = "/user-info-update";

    @PostMapping(config + "/update")
    String userInfoUpdate(@RequestBody Map<String, String> map);

    @GetMapping(config + "/send-forget-email-by-id")
    String sendForgetEmailById(@RequestParam("userId") String userId);

    @GetMapping(config + "/send-forget-email-by-email")
    String sendForgetEmailByEmail(@RequestParam("userEmail") String userEmail);

    @PostMapping(config + "/update-password")
    String updatePassword(@RequestBody Map<String,String> map);
}
