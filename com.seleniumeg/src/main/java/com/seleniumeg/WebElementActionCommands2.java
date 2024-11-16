package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementActionCommands2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the HTML page
		driver.get(
				"file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\WebElementActionCommands2.html");

		// Locate elements
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement subscribeCheckbox = driver.findElement(By.id("subscribe"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		// Check if username field is enabled
		System.out.println("Is username field enabled? " + usernameField.isEnabled());

		// Check if the login button is enabled
		System.out.println("Is login button enabled? " + loginButton.isEnabled());

		// Check if the subscribe checkbox is selected
		System.out.println("Is subscribe checkbox selected? " + subscribeCheckbox.isSelected());

		// Get and print the CSS value of the login button
		String buttonColor = loginButton.getCssValue("background-color");
		System.out.println("Login button background color: " + buttonColor);

		// Close the browser
		driver.quit();
	}
}
