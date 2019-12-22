package cn.rk6216.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;



@FeignClient(value = "euraka-clientdemo")
public interface ServiceTest {

    @RequestMapping("/test")
    String show();
}
