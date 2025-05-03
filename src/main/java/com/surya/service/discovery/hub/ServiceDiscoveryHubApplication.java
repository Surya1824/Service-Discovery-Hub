package com.surya.service.discovery.hub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryHubApplication.class, args);
	}

}
