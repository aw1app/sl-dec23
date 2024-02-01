package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.ecommerce.controller")
@SpringBootApplication
public class SpringBootRestApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiServerApplication.class, args);
	}

}
