package com.fangyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// 激活eurekaServer
@EnableEurekaServer
public class Springcloud01ProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud01ProvideApplication.class, args);
    }

}
