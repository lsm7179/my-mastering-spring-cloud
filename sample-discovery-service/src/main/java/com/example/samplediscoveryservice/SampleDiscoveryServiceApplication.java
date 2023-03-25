package com.example.samplediscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SampleDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDiscoveryServiceApplication.class, args);
	}

}
