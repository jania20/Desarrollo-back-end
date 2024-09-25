package com.microservice.celulares;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootServiceCelularesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceCelularesApplication.class, args);
	}

}
