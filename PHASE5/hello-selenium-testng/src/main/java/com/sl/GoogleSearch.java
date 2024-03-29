package com.sl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
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
	WebDriver driver = null;

	SoftAssert softAssert = new SoftAssert();

	@BeforeSuite
	public void myBeforeSuite() {
		System.out.println("INSIDE myBeforeSuite");			
	}
	
	@AfterSuite
	public void myAfterSuite() {
		System.out.println("INSIDE myAfterSuite");		
	}
	
	@BeforeTest
	public void myBeforeTest() {
		System.out.println("INSIDE myBeforeTest");			
	}
	
	@AfterTest
	public void myAfterTest() {
		System.out.println("INSIDE myAfterTest");		
	}
	
	@BeforeClass
	public void myBeforeClass() {
		System.out.println("INSIDE myBeforeClass");
		driver = new FirefoxDriver();// new EdgeDriver();// 		
	}
	
	@AfterClass
	public void myAfterClass() {
		System.out.println("INSIDE myAfterClass");
		driver.close();
	}
	
	
	@BeforeMethod
	public void myBeforeMethod() {
		System.out.println("INSIDE myBeforeMethod");
		//driver = new FirefoxDriver();		
	}
	
	@AfterMethod
	public void myAfterMethod() {
		System.out.println("INSIDE myAfterMethod");
		//driver.close();
	}
		
	
	@Test(groups = {"smoke"})
	public void searchGoogleAndTestTitleText() {
		
		System.out.printf("Inside TESTCASE %s and thread-id is %s \n", "searchGoogleAndTestTitleText", Thread.currentThread().getId());

		driver.get("http://www.google.com");

		System.out.println("Title of google page is " + driver.getTitle());

		softAssert.assertEquals(driver.getTitle(), "Google", "Title text for Google homepage failed");

	}
	
	// Challenge: Check of Google search text feild appears and contains text "flowers"
	@Test(enabled = false)
	public void testGoogleSearchTextFeildContainsFlowers() {
		System.out.printf("Inside TESTCASE %s and thread-id is %s \n", "testGoogleSearchTextFeildContainsFlowers", Thread.currentThread().getId());

		driver.get("http://www.google.com?q=flowers");	
		
		WebElement searchTFElement = driver.findElement(By.name("q"));
		
		String searchTFText = searchTFElement.getAttribute("value");
		
		System.out.println("Search TF Text="+searchTFText);

		softAssert.assertEquals(searchTFText, "flowers"); // Actual Result , Expected Result

	}

}
