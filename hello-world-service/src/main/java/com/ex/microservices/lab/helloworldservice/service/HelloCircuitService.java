package com.ex.microservices.lab.helloworldservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DefaultProperties(defaultFallback="fallback")
public class HelloCircuitService {
	@Autowired
	HelloService helloService;

	@HystrixCommand(fallbackMethod = "fallback")
	public String getHelloWorldWithCircuit(String name){
		return helloService.getHello(name);
	}

	public String fallback(String name){
		return "Hello Service Not Available";
	}
}
