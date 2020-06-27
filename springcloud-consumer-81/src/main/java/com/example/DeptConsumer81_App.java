package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * TODO
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.example"})
public class DeptConsumer81_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer81_App.class, args);
    }
}
