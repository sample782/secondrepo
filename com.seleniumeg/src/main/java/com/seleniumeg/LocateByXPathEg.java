package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXPathEg {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the HTML page
        driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\LocateByIdEg.html");

        // Locate the username input field by XPath
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));

        // Interact with the username field
        usernameField.sendKeys("testUser");

        // Close the browser
        //driver.quit();
    }
}

