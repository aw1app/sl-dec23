package com.sl;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvancedLocatingElements {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		// Set the page load timeout to 30 seconds
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		Thread.sleep(10000);// 10 secs delay 
		
		//waitDemo();
		
		locateMobileTF();
		
		driver.close();

	}

	// wait demo
	public static void waitDemo() {
		String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";

		driver.get(baseUrl);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement firstNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		
		firstNameElement.sendKeys("abcdef");

	}
	
	public static void locateMobileTF() {
		String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";

		driver.get(baseUrl);
		
		WebElement mobileNoTF = driver.findElement(By.cssSelector("input[]"));
		
		mobileNoTF.sendKeys("93949499323");

	}

}
