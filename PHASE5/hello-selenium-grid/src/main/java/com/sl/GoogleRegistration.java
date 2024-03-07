package com.sl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleRegistration {
	
	public WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@BeforeSuite
	public void beforeSuite() {
		System.out.printf("Inside %s and thread-id is %s \n", "beforeSuite", Thread.currentThread().getId());
		driver = new FirefoxDriver();
	}

	@AfterSuite
	public void afterSuite() {
		System.out.printf("Inside %s and thread-id is %s \n", "afterSuite", Thread.currentThread().getId());

		driver.close();
	}
	
	@Test(dataProvider = "googleNewUserData")
	public void googleNewAccCreation(String firstName, String lastName) {
		System.out.printf("Inside GoogleRegistration:TESTCASE %s and thread-id is %s \n", "googleNewAccCreation", Thread.currentThread().getId());
		String baseUrl = "https://accounts.google.com/signup/v2/createaccount?flowEntry=SignUp";
		driver.get(baseUrl);

		// Locate the first name feild using id
		WebElement firstNameTF = driver.findElement(By.id("firstName"));
		
		softAssert.assertNotNull(firstNameTF);

		firstNameTF.sendKeys(firstName);

		// Locate the last name feild using name
		WebElement lastNameTF = driver.findElement(By.name("lastName"));
		
		softAssert.assertNotNull(lastNameTF);
		
		lastNameTF.sendKeys(lastName);
		
	}
	
	@DataProvider(name = "googleNewUserData")
	public Object[][] googleNewUserData() {
		return new Object[][] {

				{ "Krishna", "Varma" },
				{ "Ravi", "Sarma" },
				{ "Shalini", "Yadav" }
				
			};
	}
	

}
