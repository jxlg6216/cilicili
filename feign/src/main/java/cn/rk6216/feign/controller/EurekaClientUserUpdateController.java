package cn.rk6216.feign.controller;

import cn.rk6216.feign.service.IEurekaClientUserUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
public class EurekaClientUserUpdateController {

    private static final String config = "/user-info-update";

    @Autowired
    private IEurekaClientUserUpdateService iEurekaClientUserUpdateService;

    @PostMapping(config + "/update")
    public String userInfoUpdate(@RequestBody Map<String, String> map) {
        return iEurekaClientUserUpdateService.userInfoUpdate(map);
    }

    @GetMapping(config + "/send-forget-email-by-id")
    public String sendForgetEmailById(@RequestParam("userId") String userId) {
        return iEurekaClientUserUpdateService.sendForgetEmailById(userId);
    }

    @GetMapping(config + "/send-forget-email-by-email")
    public String sendForgetEmailByEmail(@RequestParam("userEmail") String userEmail) {
        return iEurekaClientUserUpdateService.sendForgetEmailByEmail(userEmail);
    }

    @PostMapping(config + "/update-password")
    public String updatePassword(@RequestBody Map<String,String> map) {
        return iEurekaClientUserUpdateService.updatePassword(map);
    }
}
