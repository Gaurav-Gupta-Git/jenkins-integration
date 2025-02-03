package com.group.Docker_Demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/getData")
	public String getProductData() {
		
		return "Welcome to docker and kubernetes world";
	}

}
