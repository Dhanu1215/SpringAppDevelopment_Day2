package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldDemoApplication {
	
	/**
	 * Call method to display message using STS
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello from Bridgelabz");
		SpringApplication.run(HelloWorldDemoApplication.class, args);
	}

}
