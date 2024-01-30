package com.example.demo;

public class ProductNotFoundException extends Exception {

	public ProductNotFoundException(long id) {
		super("Product with id="+id + "not found");
	}

}
