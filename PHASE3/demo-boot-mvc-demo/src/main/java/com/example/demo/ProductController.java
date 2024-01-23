package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecommerce.entity.EProduct;
import com.ecommerce.repositry.EProductRepositry;

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
	

}
