package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.entity.EProduct;

@Controller
public class UIController {

	// Rest Client
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/products")
	public String listProduct(Model model) {

		EProduct[] products = restTemplate.getForObject("http://localhost/product/list", EProduct[].class);

		model.addAttribute("products", products);

		return "products-list";
	}

	@GetMapping("/product-details/{id}")
	public String displayProductDetails(@PathVariable("id") long id, Model model) {

		EProduct product = restTemplate.getForObject("http://localhost/product/details/" + id, EProduct.class);

		model.addAttribute("product", product);

		return "products-details";

	}

	@GetMapping("/edit-product/{id}")
	public String EditProductDetails(@PathVariable("id") long id, Model model) {

		EProduct product = restTemplate.getForObject("http://localhost/product/details/" + id, EProduct.class);

		model.addAttribute("product", product);

		return "edit-product-form";

	}

	@PostMapping("/saveEditedProduct")
	public String updateProduct(ModelMap model, @ModelAttribute("product") EProduct product) {

		long id = product.getID();

		EProduct savedproduct = restTemplate.postForObject("http://localhost/product/edit-product/" + id, product,
				EProduct.class);

		model.addAttribute("id", savedproduct.getID());

		return "edit-product-success";
	}

}
