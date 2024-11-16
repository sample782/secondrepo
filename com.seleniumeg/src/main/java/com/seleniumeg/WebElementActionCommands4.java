package com.seleniumeg;
/* selecting Tab, options of Tab 
 * consider realistic scenario
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementActionCommands4 {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

		// Navigate to the HTML page
		driver.get(
				"file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\WebElementActionCommands4.html");

        try {
            // Navigate to the HTML page

            // Initialize Actions class
            Actions actions = new Actions(driver);

            // Perform mouse over action
            WebElement hoverElement = driver.findElement(By.id("hoverElement"));
            actions.moveToElement(hoverElement).perform();

            // Perform right-click action
            WebElement rightClickElement = driver.findElement(By.id("rightClickElement"));
            actions.contextClick(rightClickElement).perform();

            // Perform double-click action (add another element for this if needed)
            actions.doubleClick(rightClickElement).perform(); // Just reusing for demonstration

        } finally {
            // Close the driver
            //driver.quit();
        }
    }
}

