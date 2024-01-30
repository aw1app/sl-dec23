package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.entity.AadharCard;
import com.ecommerce.entity.User;
import com.ecommerce.repositry.AadharCardRepositry;
import com.ecommerce.repositry.UserRepositry;

@Controller
public class UserController {
	
	@Autowired
	UserRepositry userRepositry;

	@Autowired
	AadharCardRepositry aadharCardRepositry;
	
	@PostMapping("/add-user")	
	public String addUser(ModelMap model, @RequestParam String uName, @RequestParam long aadharCardNo) {
		
		User user = new User();
		
		user.setName(uName);
		
		AadharCard aadharCard =  new AadharCard();
		aadharCard.setNumber(aadharCardNo);

		// First save the aadharCard to the DB table. Then save the user to the DB.
		aadharCard = aadharCardRepositry.save(aadharCard);
		
		user.setAadharCard(aadharCard);
		
		user = userRepositry.save(user);
		
		model.addAttribute("id", user.getID());
		
		return "new-user-added-success"; // New user added successfully
	}
	

}
