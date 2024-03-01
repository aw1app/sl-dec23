package com.sl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String baseUrl ="https://www.google.com";
				
		driver.get(baseUrl);		
		
		Thread.sleep(10000);// 10 secs sleep
		
		driver.close(); // close the automated browser

	}

}
