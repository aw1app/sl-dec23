package com.sl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleSearch {
	
	public WebDriver driver = new FirefoxDriver();
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void searchGoogleAndTestTitleText() {
		
		driver.get("http://www.google.com");
		
		System.out.println("Title of google page is " + driver.getTitle());
		
		softAssert.assertEquals(driver.getTitle(), "Google");		
		
	}


}
