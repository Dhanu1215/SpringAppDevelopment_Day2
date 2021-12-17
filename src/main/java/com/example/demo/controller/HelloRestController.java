package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	
	/**
	 * Call method to get details from server
	 * @return
	 */
	@RequestMapping(value = {"","/","/home"})
	public String index() {
		return "Hello from Bridgelabz..";
	}
}
