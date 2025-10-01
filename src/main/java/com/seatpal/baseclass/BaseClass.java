package com.seatpal.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver; // driver declare

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		// Maximize window
		driver.manage().window().maximize();

		// Optional: open default URL
		driver.get("https://www.seatpal.com");
	}

}
