package com.suman.jwtProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{
	@GetMapping("/hello")
	public String firstPage() {
		return "Hello World";
	}
	@PostMapping("/bolo")
	public String lastpage() {
		return "last page";
	}

}
