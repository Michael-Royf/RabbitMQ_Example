package com.michael;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {
        "com.michael.stockService",
        "com.michael.amqp"}
)
@EnableFeignClients(basePackages = "com.michael.clients")
@EnableEurekaClient
public class AppStock {
    public static void main(String[] args) {
        SpringApplication.run(AppStock.class, args);
    }
}
