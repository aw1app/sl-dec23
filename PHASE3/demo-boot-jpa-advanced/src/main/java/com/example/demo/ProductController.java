//package com.example.controller;

package com.example.demo;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@GetMapping("/listProductsByName")
	public String listProductsByName(ModelMap model, String name) {

		List<EProduct> listOfProducts = eProductRepositry.findAllByName(name);

		model.addAttribute("prodlist", listOfProducts);

		return "list-of-products"; // go to list-of-products.jsp

	}
	
	@GetMapping("/listProductsByPrice")
	public String listProductsByPrice(ModelMap model, BigDecimal price) {

		List<EProduct> listOfProducts = eProductRepositry.findAllByPrice(price);

		model.addAttribute("prodlist", listOfProducts);

		return "list-of-products"; // go to list-of-products.jsp

	}
	
	@GetMapping("/listProductsByNameStartingWith")
	public String listProductsByNameStartingWith(ModelMap model, String name) {

		List<EProduct> listOfProducts = eProductRepositry.abc(name);

		model.addAttribute("prodlist", listOfProducts);

		return "list-of-products"; // go to list-of-products.jsp

	}
	
	@GetMapping("/testdate")	
	@ResponseBody
    public String date(@RequestParam("dateAdded") 
      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateAdded) {		
	   
       return (dateAdded + " Hi");              
       
    }
	
	@GetMapping("/testSearchbyId")	
	@ResponseBody
    public String serachbyId(@RequestParam long id ) throws ProductNotFoundException {		
	   
		Optional<EProduct> eProductFromRepo = eProductRepositry.findById(id);  
		
		if (eProductFromRepo.isEmpty()) {
			throw new ProductNotFoundException(id);
		}
		
		return "Succesfully serached product with id="+id;
       
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
		//product.setDateAdded(new Date());
		System.out.println(product.getDateAdded());

		EProduct savedProduct = eProductRepositry.save(product);
		model.addAttribute("id", savedProduct.getID());

		return "add-product-success";
	}

////Add a new product

////Edit product
	@GetMapping("/editProduct")
	public String editProductForm(ModelMap model, @RequestParam long id) {
		model.addAttribute("id", id);

		Optional<EProduct> eProductFromRepo = eProductRepositry.findById(id);
		
		if (eProductFromRepo.isPresent()) {
			
			EProduct product = eProductFromRepo.get();
			model.addAttribute("product", product);

			return "edit-product-form";
		} 
		else {
			return "product-not-found";
		}

	}

	@PostMapping("/editProduct")
	public String updateProduct(ModelMap model, @ModelAttribute("product") EProduct product) {
		//product.setDateAdded(new Date());// some issue with retrieving date, so setting it again as a workaround for now.
		
		EProduct savedProduct = eProductRepositry.save(product);
		model.addAttribute("id", savedProduct.getID());

		return "edit-product-success";
	}

////Edit product

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
	
	@ExceptionHandler
	public  ResponseEntity<Object> xyz(org.springframework.web.method.annotation.MethodArgumentTypeMismatchException ex) {
		
		return new ResponseEntity<>("<br>Sorry, Invalid argument values were passed that could not be processed. Contact our Customer Care to know more.", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public  ResponseEntity<Object> xyz(ProductNotFoundException ex) {
		
		return new ResponseEntity<>(ex.getMessage() + "<br>Contact our Customer Care to know more.", HttpStatus.BAD_REQUEST);
	}

}
