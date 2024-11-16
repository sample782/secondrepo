package com.seleniumeg;
/*
Here’s a list of common WebElement actions or commands you can perform using Selenium:

1. **click()**: Clicks on the element.
2. **sendKeys(String keysToSend)**: Types text into an input field.
3. **getText()**: Retrieves the visible text of the element.
4. **getAttribute(String name)**: Gets the value of a specified attribute.
5. **clear()**: Clears the text in an input field.
6. **isDisplayed()**: Checks if the element is visible on the page.
7. **isEnabled()**: Checks if the element is enabled (can be interacted with).
8. **isSelected()**: Checks if the element is selected (e.g., checkboxes or radio buttons).
9. **submit()**: Submits a form.
10. **getCssValue(String propertyName)**: Retrieves the value of a specified CSS property.

These actions can help you interact with web elements effectively. 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementActionCommands1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the HTML page
        driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\WebElementActionCommands1.html");

        // Locate elements
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginBtn"));
        WebElement messageElement = driver.findElement(By.id("message"));

        // Clear and send keys to the username field
        usernameField.clear();
        usernameField.sendKeys("testUser");
        System.out.println("Entered Username: " + usernameField.getAttribute("value"));

        // Clear and send keys to the password field
        passwordField.clear();
        passwordField.sendKeys("testPassword");
        System.out.println("Entered Password: " + passwordField.getAttribute("value"));

        // Click the login button
        loginButton.click();
        
        // Display a message (in a real scenario, this would be set by JavaScript)
        //messageElement.sendKeys("Login successful!");

        // Get and print the message text
        System.out.println("Message: " + messageElement.getText());

        // Close the browser
        //driver.quit();
    }
}

