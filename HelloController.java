package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/")
	public String  helloController()
	{
		return "WELCOME TO EDUBRIDGE";
	}
	
	

}
