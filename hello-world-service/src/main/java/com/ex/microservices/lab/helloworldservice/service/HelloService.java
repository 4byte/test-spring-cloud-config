package com.ex.microservices.lab.helloworldservice.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "hello-service")
public interface HelloService {

	@RequestMapping(value = "/hello/{name}")
	String getHello(@PathVariable("name") String name);
}
