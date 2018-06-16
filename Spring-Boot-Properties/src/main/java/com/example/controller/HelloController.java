package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, Welcome to Spring Boot";
	}
	
	@GetMapping("/reload")
	public String reload() {
	return "relaoded";	
	}
}
