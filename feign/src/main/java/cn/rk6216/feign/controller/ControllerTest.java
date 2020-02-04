package cn.rk6216.feign.controller;

import cn.rk6216.feign.service.ServiceTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ControllerTest {

    @Resource
    private ServiceTest serviceTest;


    @RequestMapping("/du")
    public void show(){
        System.out.println(serviceTest.show());
    }
}
