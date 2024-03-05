package com.sl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FBRegistration {

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

	@Test
	public void fbAccount() {

		System.out.printf("Inside FBRegistration:TESTCASE  %s and thread-id is %s \n", "fbAccount", Thread.currentThread().getId());

		String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";

		driver.get(baseUrl);

		String cssDay = "#day";
		WebElement cssDaySelect = driver.findElement(By.cssSelector(cssDay));

		softAssert.assertNotNull(cssDaySelect);

		Select daySelect = new Select(cssDaySelect);
		daySelect.selectByVisibleText("11");

		WebElement cssGenderRadio = driver.findElement(By.cssSelector("span > span > input[type='radio'][value='2']"));
		softAssert.assertNotNull(cssGenderRadio);

		cssGenderRadio.click();

		softAssert.assertTrue(cssGenderRadio.isSelected());

		System.out.println("Gender is enabled = " + cssGenderRadio.isSelected());

		softAssert.assertAll("Either Day or Gender element was not located OR gender selection failed");

	}
}
