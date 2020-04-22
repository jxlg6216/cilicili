package cn.rk6216.client_pay8096;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientPay8096Application {

    public static void main(String[] args) {
        SpringApplication.run(ClientPay8096Application.class, args);
    }

}
