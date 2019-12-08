package cn.rk6216.eureka_clientdemo;

import cn.rk6216.eureka_clientdemo.dao.Daotest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class EurekaClientdemoApplicationTests {

//    @Value("${test}")
//    private String test;
    @Resource
    private Daotest d;

    @Test
    void contextLoads() {
//        System.out.println(test);
        System.out.println(d.findString());
    }

}
