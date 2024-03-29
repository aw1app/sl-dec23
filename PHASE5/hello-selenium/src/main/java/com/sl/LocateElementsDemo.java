package com.sl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocateElementsDemo {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		faceBookAcctCreation();

		//googleNewAccCreation();

		Thread.sleep(30000);// 30 secs sleep  (remove this in your commercial/remove projects)
		driver.close(); // close the automated browser

	}

	public static void faceBookAcctCreation() throws InterruptedException {

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
		
		Thread.sleep(5000);// 30 secs sleep  (remove this in your commercial/remove projects)
		
		// Locate the Gender using CSS selector and set it to M/F/C
		WebElement gender =  driver.findElement(By.cssSelector("input[type='radio'][value='1']")); 
		gender.click(); // selects Female
		
		
		System.out.println("Successfully located Gender radio feild and set it to value Female");
		
		//Locating image by its tag names
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		
		WebElement fb_logo_image = allImages.get(0);
		
		// Print the src of fb logo
		String srcOfFbLogoImage = fb_logo_image.getAttribute("src");
		System.out.println("FB logo src ="+srcOfFbLogoImage);
		
		
		//Locate a link and click it by matching its text.
		WebElement haveAnAcctAlreadyLinkText = driver.findElement(By.linkText("Already have an account?"));
		
		Thread.sleep(5000);// 30 secs sleep  (remove this in your commercial/remove projects)
		System.out.println("Successfully located \"Already have an account?\" link!! ");
		
		haveAnAcctAlreadyLinkText.click();
		
	}

	// google New Acc Creation
	public static void googleNewAccCreation() throws InterruptedException {

		String baseUrl = "https://accounts.google.com/signup/v2/createaccount?flowEntry=SignUp";

		driver.get(baseUrl);

		// Locate firstname textbox by its id
		WebElement firstNameTF = driver.findElement(By.id("firstName"));

		firstNameTF.sendKeys("Krishna");

		// Locate the last name feild using name
		WebElement lastNameTF = driver.findElement(By.id("lastName"));
		lastNameTF.sendKeys("Varma");
		
		Thread.sleep(5000);// 5 secs pause (remove this in your commercial/remove projects)
		
		// Locate the button using class
		//WebElement nextButton = driver.findElement(By.className("VfPpkd-vQzf8d")); // Not working
	
		String nextButtonXPath = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[2]/div/div/div/div/button/span";
		WebElement nextButton = driver.findElement(By.xpath(nextButtonXPath));
		nextButton.click();
		
		Thread.sleep(5000);// 5 secs pause (remove this in your commercial/remove projects)
		//CHALLENGE 2: Automate selecting "June" for Month drop down
		WebElement monthSelectElement = driver.findElement(By.id("month"));
		Select select = new Select(monthSelectElement);
		//select.selectByValue("6");// Select "June" - works
		select.selectByVisibleText("June"); // Select "June" - works
		

	}

}
