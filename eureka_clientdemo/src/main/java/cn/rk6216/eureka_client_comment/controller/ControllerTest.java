package cn.rk6216.eureka_client_comment.controller;

import cn.rk6216.eureka_client_comment.service.Configtest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ControllerTest {
    @Resource
    private Configtest configtest;

    @RequestMapping("/test")
    public String feignTest() {
        System.out.println("进入了clientdemo的控制层");
        //return configtest.findsname();
        return "hi~";
    }
}
