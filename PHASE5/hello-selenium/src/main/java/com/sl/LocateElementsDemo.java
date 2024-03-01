package com.sl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsDemo {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		// faceBookAcctCreation();

		googleNewAccCreation();

		Thread.sleep(30000);// 30 secs sleep
		driver.close(); // close the automated browser

	}

	public static void faceBookAcctCreation() {

		String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";

		driver.get(baseUrl);

		// Locate by id
		// WebElement firstNameElement = driver.findElement(By.id("u_0_b_QU"));
		// above did not work as facebook is creating the id dynamically (that is it not
		// "u_0_b_QU" always)

		// so try another approach
		// Locate by name
		WebElement firstNameElement = driver.findElement(By.name("firstname"));
		firstNameElement.sendKeys("abcdef");
	}

	// google New Acc Creation
	public static void googleNewAccCreation() {

		String baseUrl = "https://accounts.google.com/signup/v2/createaccount?flowEntry=SignUp";

		driver.get(baseUrl);

		// Locate firstname textbox by its id
		WebElement firstNameTF = driver.findElement(By.id("firstName"));

		firstNameTF.sendKeys("Krishna");

		// Locate the last name feild using name
		WebElement lastNameTF = driver.findElement(By.id("lastName"));
		lastNameTF.sendKeys("Varma");

	}

}
