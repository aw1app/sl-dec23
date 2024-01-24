//package com.example.controller;

package com.example.demo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

		List<EProduct> listOfProducts = eProductRepositry.findAll();

		model.addAttribute("prodlist", listOfProducts);

		return "list-of-products"; // go to list-of-products.jsp

	}

	@PostMapping("/addProduct")
	public String addProduct(ModelMap model, @RequestParam String name, @RequestParam float price, @RequestParam String dateAdded) {

		BigDecimal pr = new BigDecimal(price);

		EProduct newProd = new EProduct();
		newProd.setName(name);
		newProd.setPrice(pr);

		newProd.setDateAddedConverted(new Date());

		//Once the repositry saves the newProd object in the DB, it will return
		// an updated EProduct object that has the ID.
		EProduct savedproduct = eProductRepositry.save(newProd);
		model.addAttribute("id", savedproduct.getID());

		return "add-product-success"; // go to add-product-success.jsp
	}

	// Challenge: Add the delete functionality
	// Given an id, delete the product from the table
	@GetMapping("/deleteProduct")
	public String deleteProduct(ModelMap model, @RequestParam long id) {

		Optional<EProduct> eProductFromRepo = eProductRepositry.findById(id);
		
		model.addAttribute("id", id);

		if (eProductFromRepo.isPresent()) {

			eProductRepositry.deleteById(id);

			return "delete-product-success";
		}else {
			return "delete-product-failed";
		}
	}

}
