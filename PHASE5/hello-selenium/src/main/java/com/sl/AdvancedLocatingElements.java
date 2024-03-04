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
		
		//demoDropDownList();
		
		demoTable();

		// driver.close();

	}
	
	static void demoTable() {
		
		String baseUrl = "https://www.nyse.com/ipo-center/recent-ipo";
		driver.get(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String tableXPath = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/table";
		
		String tableXPathBody = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/table/tbody";
		
		
		List<WebElement> allRowsWebElements = driver.findElements(By.xpath(tableXPathBody+"/tr"));
		
		int noOfRows = allRowsWebElements.size();
		System.out.printf("\n No of rows in the IPO table : %s", noOfRows);
		
		// Get the  BBB foods 
		String R2C3TableCellXpath =  "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/table/tbody/tr[2]/td[3]";
		//WebElement R2C3TableCellXpathWebElement = driver.findElement(By.xpath(R2C3TableCellXpath));
		
			
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement R2C3TableCellXpathWebElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(R2C3TableCellXpath)));
		
		System.out.printf(" Text in 2R 3C is ",  R2C3TableCellXpathWebElement.getText());			
		
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
