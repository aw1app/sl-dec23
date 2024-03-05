package com.sl;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadDemo {

	static String baseUrlOfTestHtml = "file:///F:/Users/home/git/sl-dec23/PHASE5/hello-selenium/src/main/resources/test.html";

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		driver = new FirefoxDriver();
		driver.get(baseUrlOfTestHtml);

		Thread.sleep(10000);

		uploadFileUsingAutoIT();

	}

	public static void uploadFileUsingAutoIT() throws IOException, InterruptedException {

		WebElement fileUploadInput = driver.findElement(By.id("uploadPicture"));

		Actions actions = new Actions(driver);
		actions.click(fileUploadInput).perform();

		Thread.sleep(10000);

		Runtime.getRuntime().exec("F:\\AutoIT-Projects\\fileupload.exe");

	}

}
