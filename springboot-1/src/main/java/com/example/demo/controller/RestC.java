package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestC {
	@GetMapping("/hi")
	public String hello() {
		return "hello everyone ";	
	}
}