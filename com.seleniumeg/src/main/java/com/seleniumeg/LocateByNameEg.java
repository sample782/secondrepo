package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByNameEg {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the HTML page
        driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\LocateByNameEg.html");

        // Locate the username input field by name
        WebElement usernameField = driver.findElement(By.name("username"));

        // Interact with the username field
        usernameField.sendKeys("testUser");

        // Close the browser
        driver.quit();
    }
}
