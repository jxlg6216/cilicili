package cn.rk6216.eureka_client_user_update8102;

import cn.rk6216.eureka_client_user_update8102.dao.Daotest;
import org.junit.jupiter.api.Test;
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