package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecommerce.EProduct;
import com.ecommerce.dao.EProductDAO;

@Controller
public class EProductController {
	
	@Autowired
	EProductDAO eProductDAO;
	
	@GetMapping("/product-list")
	public String productList(Model model) {
		
		List<EProduct> products = eProductDAO.getProducts();
		model.addAttribute("products", products);
		
		return "products-list"; // Go to products-list.jsp
	}

}
