package com.nikhil.cloud.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@EnableHystrix
public class CloudManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudManagementApplication.class, args);
	}

}
