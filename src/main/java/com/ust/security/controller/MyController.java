package com.ust.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping
	public String home() {
		return "welcome home";
	}
	@GetMapping("/contact")
	public String contact() {
		return "Contact Us";
	}
	@GetMapping("/about")
	public String about() {
		return "About Us";
	}
}
