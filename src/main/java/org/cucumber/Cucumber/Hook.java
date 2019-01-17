package org.cucumber.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	public static WebDriver driver;

	@Before
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sb61\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@After
	public static void afterMethod() {
		//driver.close();
		//driver.quit();
	}

}
