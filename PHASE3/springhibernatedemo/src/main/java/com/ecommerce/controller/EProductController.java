package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecommerce.dao.EProductDAO;
import com.ecommerce.entity.EProductEntity;

@Controller
public class EProductController {

	@Autowired
	EProductDAO eProductDAO;

	// Example http://localhost:8080/ecommerce/listProducts

	// @RequestMapping(value ="/listProducts", method= RequestMethod.GET)
	@GetMapping("/listProducts")
	public String listProducts(ModelMap model) {

		List<EProductEntity> listOfProducts = eProductDAO.getAllProducts();

		model.addAttribute("prodlist", listOfProducts);

		return "list-of-products"; // go to list-of-products.jsp

	}

}
