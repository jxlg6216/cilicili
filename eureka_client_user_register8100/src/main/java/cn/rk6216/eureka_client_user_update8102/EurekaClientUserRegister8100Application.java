package cn.rk6216.eureka_client_user_update8102;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.rk6216.eureka_client_user_update8102.dao")
public class EurekaClientUserRegister8100Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientUserRegister8100Application.class, args);
    }

}
