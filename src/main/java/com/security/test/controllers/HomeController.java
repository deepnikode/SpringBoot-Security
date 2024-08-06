package com.security.test.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/public")
public class HomeController {
	
	
	@GetMapping("/home")
	public String Home()
	{
		return "this is home";
	}
	
	@GetMapping("/login")
	public String Login()
	{
		return "this is login";
	}
	
	@GetMapping("/register")
	public String Register()
	{
		return "this is register";
	}
	
}
