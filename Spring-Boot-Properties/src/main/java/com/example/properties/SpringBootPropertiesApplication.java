package com.example.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.controller,com.example.server")
public class SpringBootPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPropertiesApplication.class, args);
	}
}
