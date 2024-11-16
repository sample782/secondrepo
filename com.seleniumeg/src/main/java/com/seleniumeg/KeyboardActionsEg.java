package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActionsEg {
    public static void main(String[] args) {
        // Set the path for your WebDriver (adjust the path accordingly)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
            // Open the HTML page (replace with the URL or local file path)
            driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\KeyboardActionsEg.html");

            // Locate the input field
            WebElement inputField = driver.findElement(By.id("inputField"));

            // Simulate typing text into the input field
            inputField.sendKeys("Hello, Selenium!");

            // Simulate pressing the "Backspace" key to delete the last character
            inputField.sendKeys(Keys.BACK_SPACE);

            //observe ! will be missing on console output
            System.out.println(inputField.getText());
            // Simulate pressing the "Tab" key to move focus to the submit button
            inputField.sendKeys(Keys.TAB);

            // Optionally, click the submit button using the "Enter" key
            driver.findElement(By.id("submitButton")).sendKeys(Keys.ENTER);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
