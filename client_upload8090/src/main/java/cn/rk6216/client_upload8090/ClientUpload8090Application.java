package cn.rk6216.client_upload8090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {MultipartAutoConfiguration.class})
@EnableDiscoveryClient
public class ClientUpload8090Application {

    public static void main(String[] args) {
        SpringApplication.run(ClientUpload8090Application.class, args);
    }
}
