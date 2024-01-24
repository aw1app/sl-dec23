//package com.example.controller;

package com.example.demo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

//// Add a new product
	@GetMapping("/addProduct")
	public String showNewProductForm(ModelMap model) {
		
		EProduct product = new EProduct();
		model.addAttribute("product", product);

		return "new-product";
	}

	@PostMapping("/addProduct")
	public String addNewProduct(ModelMap model, @ModelAttribute("product") EProduct product) {
		product.setDateAdded(new Date());
		
		eProductRepositry.save(product);

		return "add-product-success";
	}

////Add a new product

	@GetMapping("/deleteProduct")
	public String deleteProduct(ModelMap model, @RequestParam long id) {

		Optional<EProduct> eProductFromRepo = eProductRepositry.findById(id);

		model.addAttribute("id", id);

		if (eProductFromRepo.isPresent()) {

			eProductRepositry.deleteById(id);

			return "delete-product-success";
		} else {
			return "delete-product-failed";
		}
	}

}
