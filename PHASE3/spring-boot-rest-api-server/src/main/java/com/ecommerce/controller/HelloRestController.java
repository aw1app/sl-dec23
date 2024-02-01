package com.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	
	@GetMapping("/user")
	public User hello() {
		
		User u1= new User();
		u1.age=55;
		u1.name="Sudhir";
		
		return u1;
	}
	
	@GetMapping("/users")
	public List<User> users() {
		
		User u1= new User();
		u1.age=55;
		u1.name="Sudhir";
		
		User u2= new User();
		u2.age=65;
		u2.name="Raha";
		
		
		
		return List.of(u1,u2);
	}

}

class User{
	public String name;
	public int age;	
}
