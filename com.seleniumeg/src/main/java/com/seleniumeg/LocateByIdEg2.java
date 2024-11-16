package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LocateByIdEg2 {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the HTML page (replace with your actual URL)
            driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\LocateByIdEg2.html");

            // Implicit wait
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Add a delay before clicking the button
            Thread.sleep(2000); // 2 seconds delay

            // Find the button element and click it
            WebElement button = driver.findElement(By.id("testButton"));
            button.click();

            // Add a delay to wait for the text to change
            Thread.sleep(2000); // 2 seconds delay

            // Get the text from the message div
            WebElement messageDiv = driver.findElement(By.id("message"));
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

