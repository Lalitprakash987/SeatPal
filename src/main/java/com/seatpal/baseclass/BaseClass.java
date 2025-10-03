package com.seatpal.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver; // driver declare

	@BeforeMethod
	public void setUp() {

		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lalit\\OneDrive\\Desktop\\workspace\\SeatPal\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://seatpal.co.uk/");
		driver.manage().window().maximize();
	}

	/*@AfterMethod
	public void teardown() {
		if (driver != null)
			driver.quit();

	}*/

}
