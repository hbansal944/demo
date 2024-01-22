package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class base {
	
	@GetMapping("/demo")
	public String demoTest() {
		return "running";
	}

}
