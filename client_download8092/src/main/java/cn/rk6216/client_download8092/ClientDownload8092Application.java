package cn.rk6216.client_download8092;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientDownload8092Application {

    public static void main(String[] args) {
        SpringApplication.run(ClientDownload8092Application.class, args);
    }

}
