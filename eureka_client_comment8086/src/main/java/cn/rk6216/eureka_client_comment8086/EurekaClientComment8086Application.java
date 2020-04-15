package cn.rk6216.eureka_client_comment8086;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.rk6216.eureka_client_comment8086.dao")
public class EurekaClientComment8086Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientComment8086Application.class, args);
    }

}
