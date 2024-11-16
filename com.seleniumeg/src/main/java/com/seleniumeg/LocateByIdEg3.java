package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocateByIdEg3 {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the HTML page (replace with your actual URL)
            driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\LocateByIdEg2.html");

            // Create a WebDriverWait instance
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for the button to be clickable and then click it
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("testButton")));
            Thread.sleep(2000); // Optional delay before clicking
            button.click();

            // Wait for the message to be visible
            WebElement messageDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
            Thread.sleep(2000); // Optional delay after clicking

            // Get the text from the message div
            String messageText = messageDiv.getText();

            // Display the text on the console
            System.out.println("Message text: " + messageText);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
