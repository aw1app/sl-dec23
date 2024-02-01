package com.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.EProduct;
import com.ecommerce.repositry.EProductRepositry;

@RestController
@RequestMapping("/product")
public class EProductRestController {

	@Autowired
	EProductRepositry eProductRepositry;

	// Fetch full list of products from the DB
	@GetMapping("/list")
	public List<EProduct> showAllProducts() {

		List<EProduct> products = eProductRepositry.findAll();

		return products;
	}

	// Fetch a Single Product Details from the DB
	@GetMapping(value = "/details/{id}")
	public EProduct showProduct(@PathVariable("id") long id) {

		Optional<EProduct> productFromRepo = eProductRepositry.findById(id);

		if (productFromRepo.isPresent()) {
			EProduct product = productFromRepo.get();
			return product;
		} else {
			return new EProduct();
			// return "Product with id = "+ id + " not found";
		}

	}

}
