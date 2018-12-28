package com.lic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProviderUserMyMetadataApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserMyMetadataApplication.class, args);
	}

}

