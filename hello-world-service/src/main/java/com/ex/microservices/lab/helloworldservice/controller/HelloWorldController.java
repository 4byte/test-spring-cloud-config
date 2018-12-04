package com.ex.microservices.lab.helloworldservice.controller;

import com.ex.microservices.lab.helloworldservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	HelloService helloService;

	@RequestMapping("hello-world")
	@ResponseBody
	public String helloGet() {
		return helloService.getHello("world");
	}
}
