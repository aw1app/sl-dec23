package com.ecommerce;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	    public static void main(String[] args)
	    {
	 
	        // Using AnnotationConfigApplicationContext
	        ApplicationContext context
	            = new AnnotationConfigApplicationContext(
	            		EProductConfig.class);
	 
	        // Getting the bean
	        EProduct EProduct
	            = context.getBean("eProductBean", EProduct.class);
	 
	        // Invoking the method	        
	        String name = EProduct.getName();
	        System.out.println("EProduct bean name is "+name);
	        BigDecimal price = EProduct.getPrice();
	        System.out.println("EProduct bean price is "+price);
	    }
	}


