package com.seleniumeg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
https://storage.googleapis.com/chrome-for-testing-public/130.0.6723.69/win32/chrome-win32.zip
 */
public class FirstExample {
    public static void main(String[] args) {
        // Set the path to the GeckoDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        //System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("http://www.example.com");

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}

