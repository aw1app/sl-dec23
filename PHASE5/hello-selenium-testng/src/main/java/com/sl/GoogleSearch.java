package com.sl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleSearch {

	// public WebDriver driver = new FirefoxDriver();

	static {
		// For Chrome Driver only
		// Downlaod from
		// https://storage.googleapis.com/chrome-for-testing-public/118.0.5962.0/win64/chromedriver-win64.zip
		// and upzip
		
		String chromeDriverLocation = "C:\\Users\\home\\Downloads\\chromedriver-win64v122\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		
	};

	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new FirefoxDriver();

	SoftAssert softAssert = new SoftAssert();

	@Test
	public void searchGoogleAndTestTitleText() {

		driver.get("http://www.google.com");

		System.out.println("Title of google page is " + driver.getTitle());

		softAssert.assertEquals(driver.getTitle(), "Google");

	}
	
	// Challenge: Check of Google search text feild appears and contains text "flowers"
	@Test
	public void testGoogleSearchTextFeildContainsFlowers() {

		driver.get("http://www.google.com?q=flowers");	
		
		WebElement searchTFElement = driver.findElement(By.name("q"));
		
		String searchTFText = searchTFElement.getAttribute("value");
		
		System.out.println("Search TF Text="+searchTFText);

		softAssert.assertEquals(searchTFText, "flowers");

	}

}
