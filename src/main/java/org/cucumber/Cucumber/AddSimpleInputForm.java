package org.cucumber.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddSimpleInputForm {
	static WebDriver driver;

	@Given("User is in seleniumeasy page")
	public void user_is_in_seleniumeasy_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sb61\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("user has to click the input forms")
	public void user_has_to_click_the_input_forms() {
		System.out.println(" hi inpunt");
	}

	@Given("user has to click the simple form demo")
	public void user_has_to_click_the_simple_form_demo() {
		System.out.println(" hi inpunt");
	}

	@When("User has to pass the text")
	public void user_has_to_pass_the_text() {
		System.out.println(" hi inpunt");
		;
	}

	@When("User has to click on the show message")
	public void user_has_to_click_on_the_show_message() {
		System.out.println(" hi inpunt");
	}

	@Then("User has to view the message typed")
	public void user_has_to_view_the_message_typed() {
		System.out.println(" hi inpunt");
	}

}
