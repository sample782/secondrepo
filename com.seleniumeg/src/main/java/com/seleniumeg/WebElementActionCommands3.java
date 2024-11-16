package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementActionCommands3 {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the HTML page
		driver.get(
				"file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\WebElementActionCommands3.html");

        // Locate elements using various techniques
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement maleRadio = driver.findElement(By.id("male"));
        WebElement femaleRadio = driver.findElement(By.id("female"));
        WebElement subscribeCheckbox = driver.findElement(By.id("subscribe"));
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        WebElement submitButton = driver.findElement(By.id("submitBtn"));
        WebElement messageElement = driver.findElement(By.id("message"));

        // Interact with the username field
        usernameField.clear();
        usernameField.sendKeys("testUser");
        System.out.println("Entered Username: " + usernameField.getAttribute("value"));

        // Select a radio button
        maleRadio.click();
        System.out.println("Selected Gender: " + (maleRadio.isSelected() ? "Male" : "Female"));

        // Check the subscribe checkbox
        if (!subscribeCheckbox.isSelected()) {
            subscribeCheckbox.click();
        }
        System.out.println("Subscribe Checkbox is Selected: " + subscribeCheckbox.isSelected());

        // Select an option from the dropdown
        Select dropdownSelect = new Select(dropdown);
        dropdownSelect.selectByVisibleText("Option 2");
        System.out.println("Selected Dropdown Option: " + dropdownSelect.getFirstSelectedOption().getText());

        // Click the submit button
        submitButton.click();
        //messageElement.setText("Form submitted successfully!");
        System.out.println("Message: " + messageElement.getText());

        // Close the browser
        //driver.quit();
    }
}

