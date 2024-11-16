package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocateByNameEg2 {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the HTML page (replace with your actual URL)
            driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\LocateByNameEg2.html");

            // Create a WebDriverWait instance
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the username field and enter a value
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            usernameField.sendKeys("testuser");

            // Locate the age field and enter a value
            WebElement ageField = driver.findElement(By.name("age"));
            ageField.sendKeys("30");

            // Locate the country dropdown and select a value
            WebElement countryDropdown = driver.findElement(By.name("country"));
            countryDropdown.sendKeys("Canada"); // You could also use click() and select from dropdown options

            // Locate and click the submit button
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submitButton")));
            submitButton.click();

            // Wait for the message to be visible after form submission
            WebElement messageDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

            // Get the text from the message div
            String messageText = messageDiv.getText();

            // Display the text on the console
            System.out.println("Message text: " + messageText);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
