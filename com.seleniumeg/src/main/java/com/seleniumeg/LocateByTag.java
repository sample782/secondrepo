package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateByTag {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();


        try {
            driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\LocateByNameEg.html");

            // Locate all <input> tags
            List<WebElement> inputs = driver.findElements(By.tagName("input"));

            // Print type attribute of each input field
            for (WebElement input : inputs) {
                System.out.println("Input type: " + input.getAttribute("type"));
            }
        } finally {
            driver.quit();
        }
    }
}

