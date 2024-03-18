package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.ecommerce","com.ecommerce.controller","com.ecommerce.repositry","com.ecommerce.entity"})
@SpringBootApplication
public class SpringSecurityUserAdminDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityUserAdminDemoApplication.class, args);
	}

}
