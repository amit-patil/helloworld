package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		System.out.println("Hello Amit");
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
