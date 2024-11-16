package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventsActionsEg {
    public static void main(String[] args) {
        // Set the path to your WebDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the HTML page
            driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\MouseEventsActionsEg.html");

            // Create an Actions object
            Actions actions = new Actions(driver);

            // Locate the button to click
            WebElement clickButton = driver.findElement(By.id("clickButton"));
            actions.click(clickButton).perform(); // Click the button
            Thread.sleep(1000); // Wait for 1 second to observe the click action

            // Locate the hover div
            WebElement hoverDiv = driver.findElement(By.id("hoverDiv"));
            actions.moveToElement(hoverDiv).perform(); // Hover over the div
            Thread.sleep(1000); // Wait for 1 second to observe the hover action

            // Locate the button to double click
            WebElement doubleClickButton = driver.findElement(By.id("doubleClickButton"));
            actions.doubleClick(doubleClickButton).perform(); // Double click the button
            Thread.sleep(1000); // Wait for 1 second to observe the double click action

            // Right click on the button
            actions.contextClick(clickButton).perform(); // Right-click on the button
            Thread.sleep(1000); // Wait for 1 second to observe the right-click action

            // Locate the draggable div
            WebElement dragDiv = driver.findElement(By.id("dragDiv"));
            // Locate the drop area
            WebElement dropArea = driver.findElement(By.id("dropArea"));

            // Perform drag and drop
            actions.clickAndHold(dragDiv)
                   .moveToElement(dropArea)
                   .release()
                   .perform(); // Drag and drop the div
            Thread.sleep(1000); // Wait for 1 second to observe the drop action

            // Optionally, print the result text (just for verification)
            WebElement resultText = driver.findElement(By.id("result"));
            System.out.println("Result text: " + resultText.getText());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

