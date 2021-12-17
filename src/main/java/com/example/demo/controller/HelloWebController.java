package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
	
	/**
	 * Call method to display message in Web
	 * @return
	 */
	@GetMapping("/web")
	public String hello() {
		return "hello";
	}
	
	/**
	 * Call method to display message in Web
	 * @return
	 */
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message","This is a custom message.Hello from bridgelabz");
		return "message";
	}
}
