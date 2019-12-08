package cn.rk6216.eureka_clientdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.rk6216.eureka_clientdemo.dao")
public class EurekaClientdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientdemoApplication.class, args);
    }

}
