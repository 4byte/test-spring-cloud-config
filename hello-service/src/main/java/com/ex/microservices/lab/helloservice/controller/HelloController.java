package com.ex.microservices.lab.helloservice.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Controller
@RequestMapping("/")
public class HelloController {


	@RequestMapping("hello/{name}")
	@ResponseBody
	public String helloGet(@PathVariable String name) {
		return "Hello " + name;
	}
}
