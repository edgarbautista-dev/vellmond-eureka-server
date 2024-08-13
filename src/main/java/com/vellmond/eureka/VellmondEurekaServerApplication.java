package com.vellmond.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VellmondEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VellmondEurekaServerApplication.class, args);
    }

}
