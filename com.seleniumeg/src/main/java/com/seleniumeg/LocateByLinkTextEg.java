package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkTextEg {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the HTML page (replace with your actual URL)
            driver.get("https://www.example.com");
            // Locate the link by its text
            WebElement link = driver.findElement(By.linkText("More information..."));

            // Print the URL of the link
            System.out.println("Link URL: " + link.getAttribute("href"));

            // Click the link (optional)
            link.click();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
