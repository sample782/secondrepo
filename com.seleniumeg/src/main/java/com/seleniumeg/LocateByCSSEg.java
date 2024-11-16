package com.seleniumeg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSSEg {
	public static void main(String[] args) {
		// Set the path for the ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the HTML page
		driver.get(
				"file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\LocateByCSSEg.html");

		// Locate the username input field by CSS selector
		WebElement usernameField = driver.findElement(By.cssSelector(".input-field"));

		// Interact with the username field
		usernameField.sendKeys("testUser");

		System.out.println(usernameField.getAttribute("class"));

		// Locate the username input field by CSS selector
		List<WebElement> fields = driver.findElements(By.cssSelector(".input-field"));

		for (WebElement element : fields) {
			// Interact with the username field
			element.sendKeys("testUser");

			System.out.println(element.getAttribute("class"));

		}
		// Close the browser
		driver.quit();
	}
}
