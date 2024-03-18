package com.ecommerce.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("In hello");
		return "hello";
	}
	
	@GetMapping("/")
	public String index() {
		System.out.println("In home");//Go to WEB-INF/views/index.jsp
		return "index";
	}
	
	@GetMapping("/home")
	public String home() {
		System.out.println("In home");//Go to WEB-INF/views/home.jsp
		return "home";
	}
	
	@GetMapping("/myuser")
	@PreAuthorize("hasRole('ROLE_USER')")
	public String user() {
		System.out.println("In user");
		return "user"; // Go to WEB-INF/views/user.jsp
	}

	@GetMapping("/myadmin")
	@PreAuthorize("hasRole('ROLE_AMDIN')")
	public String admin() {
		System.out.println("In admin");
		return "admin"; //Go to WEB-INF/views/admin.jsp
	}

}
