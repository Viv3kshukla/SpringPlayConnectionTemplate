package com.samples.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samples.sample.service.HelloService;


@RestController
public class HelloController {

	@Autowired
	private HelloService service;
	
	@GetMapping("/")
	public String sayHello() {
		return service.sayHello();
	}
	
	
}
