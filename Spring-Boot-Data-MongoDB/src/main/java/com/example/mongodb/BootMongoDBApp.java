package com.example.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.mongodb.controller,com.example.mongodb.dal,com.example.mongodb.model")
public class BootMongoDBApp {

	public static void main(String[] args) {
		SpringApplication.run(BootMongoDBApp.class, args);
	}
}