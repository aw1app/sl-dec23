package com.sl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DummyTest {

	// WebDriver driver = new ChromeDriver();
	WebDriver driver = null;

	SoftAssert softAssert = new SoftAssert();
	
	@BeforeSuite
	public void beforeSuite() {

		//System.out.printf("Inside %s and thread-id is %s \n", "beforeSuite", Thread.currentThread().getId());
		driver = new FirefoxDriver();
	}

	@AfterSuite
	public void afterSuite() {
		//System.out.printf("Inside %s and thread-id is %s \n", "afterSuite", Thread.currentThread().getId());

		driver.close();
	}
	
	@Test(dependsOnMethods = {"f4","f6"})
	public void f1() {
		
		System.out.printf("Inside %s and thread-id is %s \n", "f1", Thread.currentThread().getId());
		
	}
	
	@Test(groups = {"smoke"})
	public void f2() {
		
		System.out.printf("Inside %s and thread-id is %s \n", "f2", Thread.currentThread().getId());
		
	}

	
	@Test(enabled=false)
	public void f3() {
		
		System.out.printf("Inside %s and thread-id is %s \n", "f3", Thread.currentThread().getId());
		
	}

	
	@Test(dependsOnGroups = {"smoke"})
	public void f4() {
		
		System.out.printf("Inside %s and thread-id is %s \n", "f4", Thread.currentThread().getId());
		
	}
	
	@Test(groups = {"smoke"})
	public void f5() {
		
		System.out.printf("Inside %s and thread-id is %s \n", "f5", Thread.currentThread().getId());
		
		
	}
	
	@Test(priority = 1)
	public void f6() {
		
		System.out.printf("Inside %s and thread-id is %s \n", "f6", Thread.currentThread().getId());
		
	}



}
