package com.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecommerce.entity.AadharCard;
import com.ecommerce.entity.EducationalDegree;
import com.ecommerce.entity.MobilePhone;
import com.ecommerce.entity.User;
import com.ecommerce.repositry.AadharCardRepositry;
import com.ecommerce.repositry.EducationalDegreeRepositry;
import com.ecommerce.repositry.MobilePhoneRepositry;
import com.ecommerce.repositry.UserRepositry;

@Controller
public class UserController {

	@Autowired
	UserRepositry userRepositry;

	@Autowired
	AadharCardRepositry aadharCardRepositry;

	@Autowired
	MobilePhoneRepositry mobilePhoneRepositry;
	
	@Autowired
	EducationalDegreeRepositry educationalDegreeRepositry;

	@PostMapping("/add-user")
	public String addUser(ModelMap model, @RequestParam String uName, @RequestParam long aadharCardNo) {

		User user = new User();

		user.setName(uName);

		AadharCard aadharCard = new AadharCard();
		aadharCard.setNumber(aadharCardNo);

		// First save the aadharCard to the DB table. Then save the user to the DB.
		aadharCard = aadharCardRepositry.save(aadharCard);

		user.setAadharCard(aadharCard);

		user = userRepositry.save(user);

		model.addAttribute("id", user.getID());

		return "new-user-added-success"; // New user added successfully
	}

	@PostMapping("/add-user-with-mobiles")
	@ResponseBody
	public String addUserWithMobiles(@RequestParam String uName, @RequestParam long aadharCardNo,
			@RequestParam long mobileNo1, @RequestParam long mobileNo2) {

		User user = new User();
		user.setName(uName);

		AadharCard aadharCard = new AadharCard();
		aadharCard.setNumber(aadharCardNo);

		aadharCardRepositry.save(aadharCard); // This will create an id for the aadharCard object.

		user.setAadharCard(aadharCard);

		userRepositry.save(user);

		MobilePhone m1 = new MobilePhone();
		m1.setNumber(mobileNo1);
		m1.setUser(user);
		m1 = mobilePhoneRepositry.save(m1);

		MobilePhone m2 = new MobilePhone();
		m2.setNumber(mobileNo2);
		m2.setUser(user);
		m2 = mobilePhoneRepositry.save(m2);

		List<MobilePhone> mobiles = new ArrayList<MobilePhone>();
		mobiles.add(m1);
		mobiles.add(m2);

		user.setPhones(mobiles);

		// userRepositry.save(user);

		return "User with id=" + user.getID() + " is created. His aadhar card id=" + aadharCard.getID();
	}

	// show-form
	@GetMapping("/add-user-with-mobiles-simplified")
	public String addUserWithMobiles(Model model) {
		User user = new User();
		model.addAttribute("user", user);

		return "new-user";
	}

	// process-form
	@PostMapping("/add-user-with-mobiles-simplified")
	public String addUserWithMobiles(Model model, @ModelAttribute("user") User user) {

		user = userRepositry.save(user);

		List<MobilePhone> mobiles = user.getPhones();

		for (MobilePhone m : mobiles) {
			m.setUser(user);
			m = mobilePhoneRepositry.save(m);
		}

		model.addAttribute("id", user.getID());

		return "new-user-added-success"; // New user added successfully
	}

	// With Degrees (M-M mapping demo)
	// show-form
	@GetMapping("/add-user-with-degrees-simplified")
	public String addUserWithDegrees(Model model) {
		User user = new User();
		model.addAttribute("user", user);

		return "new-user-with-degrees";
	}

	// process-form
	@PostMapping("/add-user-with-degrees-simplified")
	public String addUserWithDegrees(Model model, @ModelAttribute("user") User user) {

		user = userRepositry.save(user);

		List<MobilePhone> mobiles = user.getPhones();

		for (MobilePhone m : mobiles) {
			m.setUser(user);
			m = mobilePhoneRepositry.save(m);
		};	
		
		
		List<EducationalDegree> degrees = user.getDegrees();
		
		for (EducationalDegree degree : degrees) {
			degree.addUser(user);
			degree = educationalDegreeRepositry.save(degree);
		};
		

		model.addAttribute("id", user.getID());

		return "new-user-added-success"; // New user added successfully
	}

}
