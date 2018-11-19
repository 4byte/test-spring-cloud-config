package com.ex.microservices.lab.helloworldservice.service;


import feign.Param;
import feign.RequestLine;


public interface HelloService {
	@RequestLine("GET /hello/{name}")
	String getHelloWorld(@Param("name") String owner);
}
