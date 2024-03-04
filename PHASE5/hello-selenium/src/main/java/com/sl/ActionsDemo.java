package com.sl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	static WebDriver driver = null;
	static String baseUrlOfTestHtml = "file:///F:/Users/home/git/sl-dec23/PHASE5/hello-selenium/src/main/resources/test.html";

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		Thread.sleep(10000);

		//demoDoubleClick();
		
		demoMultipleActions();

	}

	public static void demoDoubleClick() throws InterruptedException {

		driver.get(baseUrlOfTestHtml);

		Thread.sleep(5000);

		Actions actions = new Actions(driver);

		WebElement button = driver.findElement(By.id("dblButton"));

		actions.doubleClick(button).perform();

	}

	// Demo multiple actions
	static void demoMultipleActions() throws InterruptedException {

		driver.get(baseUrlOfTestHtml);
		
		WebElement button = driver.findElement(By.id("dblButton"));
		
		WebElement helloSpanTag = driver.findElement(By.id("xyz"));
		
		Actions actions = new Actions(driver);

		Thread.sleep(5000);
		
		actions
		.moveToElement(button)
		.click(button)
		.pause(3000)		
		.moveToElement(helloSpanTag)
		.pause(3000)
		.doubleClick(helloSpanTag)
		.release()
		.build()
		.perform();		
		
	}

}
