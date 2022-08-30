package com.monster.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author CustomLZH
 */
@SpringBootApplication
@EnableEurekaClient
public class MonsterGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonsterGatewayApplication.class, args);
    }

}
