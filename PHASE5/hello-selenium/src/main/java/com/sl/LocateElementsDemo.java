package com.sl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsDemo {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";
		
		driver.get(baseUrl);
		
		//WebElement firstNameElement = driver.findElement(By.id("u_0_b_QU"));
		//above did not work as facebook is creating the id dynamically (that is it not  "u_0_b_QU" always)
		
		// so try another approach
		WebElement firstNameElement = driver.findElement(By.name("firstname"));
		firstNameElement.sendKeys("abcdef");
		
		
		Thread.sleep(20000);// 20 secs sleep
		driver.close(); // close the automated browser

	}

}
