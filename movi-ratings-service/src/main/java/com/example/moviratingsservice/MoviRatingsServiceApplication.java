package com.example.moviratingsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MoviRatingsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviRatingsServiceApplication.class, args);
	}

}
