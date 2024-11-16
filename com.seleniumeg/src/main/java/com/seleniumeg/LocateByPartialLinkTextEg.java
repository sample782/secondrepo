package com.seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByPartialLinkTextEg {
	public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the HTML page (replace with your actual URL)
            driver.get("file:///C:\\Users\\Administrator\\eclipse-workspace\\com.seleniumeg\\src\\main\\resources\\LocateByLinkPartialTextEg.html");

			// Locate the link by partial link text
			WebElement link = driver.findElement(By.partialLinkText("Page Two"));

			// Output the href attribute of the located link
			System.out.println("Found link: " + link.getAttribute("href"));

			// Optionally, click the link
			// link.click();
		} finally {
			// Close the browser
			driver.quit();
		}
	}
}
