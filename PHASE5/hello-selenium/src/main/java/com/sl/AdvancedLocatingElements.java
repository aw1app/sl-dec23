package com.sl;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvancedLocatingElements {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		// Set the page load timeout to 30 seconds
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		Thread.sleep(10000);// 10 secs delay

		// waitDemo();

		// locateMobileTF();

		// demoAdvancedXPathSelector();

		// CHALLENGE : demoAdvancedCSSSelector();
		
		demoDropDownList();

		// driver.close();

	}

	static void demoDropDownList() {

		String baseUrl = "file:///F:/Users/home/git/sl-dec23/PHASE5/hello-selenium/src/main/resources/test.html";
		driver.get(baseUrl);

		// Locate and Process multi select list
		WebElement selectMonthElement = driver.findElement(By.id("month"));

		Select selectMonth = new Select(selectMonthElement);
		System.out.printf("\n selectMonth.isMultiple() = %s", selectMonth.isMultiple());

		selectMonth.selectByIndex(0); // Select Jan
		selectMonth.selectByIndex(3); // also select Apr
		selectMonth.selectByValue("6"); // also select June
		selectMonth.selectByVisibleText("Sep");

		// verify the selections (Jan, Apr, June and Sep)
		List<WebElement> allMonthsSelected = selectMonth.getAllSelectedOptions();
		for (WebElement monthOption : allMonthsSelected) {
			System.out.printf("\n option selected = %s", monthOption.getText());
		}

	}

	static void demoAdvancedCSSSelector() {

		String baseUrl = "file:///F:/Users/home/git/sl-dec23/PHASE5/hello-selenium/src/main/resources/test.html";
		driver.get(baseUrl);

		// Locate the h4 which is second child of div that has id – eCommerce
		WebElement h4SecondChildInsideDiv = driver.findElement(By.cssSelector("div[id='eCommerce'] h4:nth-child(2)"));
		System.out.println("h4SecondChildInsideDiv text is " + h4SecondChildInsideDiv.getText()); // h4 second

		// CHALLENGE: Change it's text to "Hello Selenium"

	}

	static void demoAdvancedXPathSelector() {
		String baseUrl = "file:///F:/Users/home/git/sl-dec23/PHASE5/hello-selenium/src/main/resources/test.html";
		driver.get(baseUrl);

		List<WebElement> inputTagElements = driver.findElements(By.xpath("//input[contains(@id, 'admin')]"));

		System.out.println(" No of //input[contains(@id, 'admin')] elements " + inputTagElements.size());
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

		// WebElement mobileNoTF = driver.findElements(By.cssSelector("input")).get(4);
		WebElement mobileNoTF = driver.findElement(By.xpath("input[4]"));

		mobileNoTF.sendKeys("93949499323");

	}

}
