package com.ecommerce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EProductConfig {
	
	
		// Creating EProduct class Bean
	    // using Bean annotation
	    @Bean	    
	    public EProduct eProductBean()
	    {
	 
	        // Returns the College class object
	        return new EProduct();
	    }
	}


