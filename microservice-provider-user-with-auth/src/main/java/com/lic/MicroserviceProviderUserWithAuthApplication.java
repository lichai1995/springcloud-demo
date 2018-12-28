package com.lic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProviderUserWithAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserWithAuthApplication.class, args);
	}

}

