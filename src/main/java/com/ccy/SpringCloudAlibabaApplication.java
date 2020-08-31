package com.ccy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@EnableDiscoveryClient
public class SpringCloudAlibabaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaApplication.class, args);
    }

}
