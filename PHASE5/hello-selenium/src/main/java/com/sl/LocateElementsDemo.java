package com.sl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateElementsDemo {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();

		
		
		
		
		Thread.sleep(10000);// 10 secs sleep
		driver.close(); // close the automated browser

	}

}
