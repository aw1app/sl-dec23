package com.sl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleSearch {

	// public WebDriver driver = new FirefoxDriver();

	static {
		// Downlaod from
		// https://storage.googleapis.com/chrome-for-testing-public/118.0.5962.0/win64/chromedriver-win64.zip
		// and upzip

		String chromeDriverLocation = "C:\\Users\\home\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
	};

	WebDriver driver = new ChromeDriver();

	SoftAssert softAssert = new SoftAssert();

	@Test
	public void searchGoogleAndTestTitleText() {

		driver.get("http://www.google.com");

		System.out.println("Title of google page is " + driver.getTitle());

		softAssert.assertEquals(driver.getTitle(), "Google");

	}

}
