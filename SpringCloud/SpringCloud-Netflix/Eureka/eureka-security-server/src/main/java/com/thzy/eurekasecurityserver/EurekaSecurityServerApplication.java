package com.thzy.eurekasecurityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: MicroServiceStudy
 * @description:
 * @author: Mr.Wang
 * @create: 2024-06-06 16:52
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaSecurityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSecurityServerApplication.class, args);
    }
}
