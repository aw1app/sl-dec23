package com.sl;

import java.time.Duration;
import java.util.List;
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
		
		// locateMobileTF();
		
		//demoAdvancedXPathSelector();
		
		//driver.close();

	}

	static void demoAdvancedXPathCSSSelector() {
		
		String baseUrl = "file:///F:/Users/home/git/sl-dec23/PHASE5/hello-selenium/src/main/resources/test.html";
		driver.get(baseUrl);
		
		// Locate the h4 which is second child of div that has id – eCommerce
		
		
		// Change it's text to "Hello Selenium"
	}
	
	static void demoAdvancedXPathSelector() {
		String baseUrl = "file:///F:/Users/home/git/sl-dec23/PHASE5/hello-selenium/src/main/resources/test.html";
		driver.get(baseUrl);
		
		List<WebElement> inputTagElements = driver.findElements(By.xpath("//input[contains(@id, 'admin')]"));
		
		System.out.println(" No of //input[contains(@id, 'admin')] elements "+ inputTagElements.size());		
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
		
		//WebElement mobileNoTF = driver.findElements(By.cssSelector("input")).get(4);
		WebElement mobileNoTF = driver.findElement(By.xpath("input[4]"));
		
		mobileNoTF.sendKeys("93949499323");

	}

}
