package com.ex.microservices.lab.helloworldservice.controller;

import com.ex.microservices.lab.helloworldservice.service.HelloCircuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RefreshScope
@Component
@Controller
@RequestMapping("/")
public class HelloWorldController {
	@Autowired
	HelloCircuitService helloCircuitService;

	@RequestMapping("hello-world")
	@ResponseBody
	public String helloGet() {
		return helloCircuitService.getHelloWorldWithCircuit("world");
	}
}
