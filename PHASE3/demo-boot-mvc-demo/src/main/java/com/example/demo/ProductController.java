//package com.example.controller;

package com.example.demo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	
	@Autowired
	EProductRepositry eProductRepositry;
	
	@GetMapping("/listProducts")
	public String listProducts(ModelMap model) {
		
		List<EProduct>  listOfProducts = eProductRepositry.findAll();
		
		model.addAttribute("prodlist" , listOfProducts);
		
		return "list-of-products"; // go to list-of-products.jsp
		
	}
	
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestParam String name, @RequestParam float price) {
		
		BigDecimal pr = new BigDecimal(price);
		
		
		EProduct newProd = new EProduct();
		newProd.setName(name);
		newProd.setPrice(pr);
		newProd.setDateAddedConverted(new Date());
		
		eProductRepositry.save(newProd);
		
		return "add-product-success"; // go to add-product-success.jsp
		
	}
	

}
