package org.example.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryMay2024Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryMay2024Application.class, args);
    }

}
