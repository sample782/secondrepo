package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertConfirmPromptEg {
    public static void main(String[] args) throws Exception{
        // Set the path to your WebDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the HTML page
            driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\AlertConfirmPromptEg.html");

            // Handle alert
            WebElement alertButton = driver.findElement(By.xpath("//button[text()='Show Alert']"));
            alertButton.click();


            // Switch to alert and accept it
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert message: " + alert.getText());
            alert.accept(); // Click OK

            Thread.sleep(3000);           
            // Handle confirm
            WebElement confirmButton = driver.findElement(By.xpath("//button[text()='Show Confirm']"));
            confirmButton.click();
            alert = driver.switchTo().alert();
            System.out.println("Confirm message: " + alert.getText());
            alert.dismiss(); // Click Cancel (or use alert.accept() to click OK)

            Thread.sleep(3000);
            
            // Handle prompt
            WebElement promptButton = driver.findElement(By.xpath("//button[text()='Show Prompt']"));
            promptButton.click();
            alert = driver.switchTo().alert();
            System.out.println("Prompt message: " + alert.getText());
            alert.sendKeys("John Doe"); // Enter text in prompt
            alert.accept(); // Click OK

            Thread.sleep(3000);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

