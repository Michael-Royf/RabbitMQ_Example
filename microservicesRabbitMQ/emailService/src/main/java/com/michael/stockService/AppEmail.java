package com.michael.stockService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.michael.clients")
@SpringBootApplication(scanBasePackages = {
        "com.michael.stockService",
        "com.michael.amqp"}
)
@EnableEurekaClient
public class AppEmail {
    public static void main(String[] args) {
        SpringApplication.run(AppEmail.class, args);
    }
}
