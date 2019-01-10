package org.cucumber.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer {
	static WebDriver driver;

	@Given("The user is in gurutelecom home page")
	public void the_user_is_in_gurutelecom_home_page() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sb61\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Given("user navigates to add customer page")
	public void user_navigates_to_add_customer_page() {

		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("when the user fill in the details")
	public void when_the_user_fill_in_the_details() throws InterruptedException {
		Thread.sleep(1000);
		// driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("siva");

		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("sankari");

		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("abc@gmail.com");

		WebElement address = driver.findElement(By.name("addr"));
		address.sendKeys("chennai");

		WebElement phno = driver.findElement(By.id("telephoneno"));
		phno.sendKeys("123445");
	}

	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("the customer id is generated")
	public void the_customer_id_is_generated() {
		String text = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[2]/td/b")).getText();
		System.out.println(text);

	}

}
