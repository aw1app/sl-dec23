package com.sl;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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
		
		//Connect to hub and execute the test cases in this class.
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setPlatform(Platform.WIN10);
		caps.setBrowserName("firefox");
		
		
		try {
			driver = new RemoteWebDriver(new URL("http://192.168.59.1:4444/wd/hub"), caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
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
