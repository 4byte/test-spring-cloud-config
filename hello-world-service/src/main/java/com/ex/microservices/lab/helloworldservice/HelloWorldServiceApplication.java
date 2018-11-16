package com.ex.microservices.lab.helloworldservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HelloWorldServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldServiceApplication.class, args);
	}
}
