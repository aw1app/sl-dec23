package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;

@EnableJpaRepositories
@ComponentScan({"com.example.demo","com.ecommerce.controller","com.ecommerce.entity","com.ecommerce.repositry"})
@SpringBootApplication
public class DemoMVCForm {

	public static void main(String[] args) {
		SpringApplication.run(DemoMVCForm.class, args);
	}

}
