package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudApplication {

	public static void main(String[] args) {
		System.out.println("Application Start");
		SpringApplication.run(SpringBootCrudApplication.class, args);
		System.out.println("App Running");
	}

}
