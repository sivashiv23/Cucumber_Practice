package org.cucumber.Cucumber;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

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
	public void when_the_user_fill_in_the_details(DataTable dataTable) {

		// List<List<String>> cust_data_asLists = dataTable.asLists(String.class);
		List<Map<String, String>> cust_data_asMaps = dataTable.asMaps(String.class, String.class);
		System.out.println(cust_data_asMaps);
		driver.findElement(By.id("fname")).sendKeys(cust_data_asMaps.get(2).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(cust_data_asMaps.get(1).get("lname"));
		driver.findElement(By.id("email")).sendKeys(cust_data_asMaps.get(0).get("email"));
		driver.findElement(By.name("addr")).sendKeys(cust_data_asMaps.get(1).get("addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(cust_data_asMaps.get(2).get("telephoneno"));

	}

	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("the customer id is generated")
	public void the_customer_id_is_generated() {
		String text = driver.findElement(By.xpath("/html/body/section/div/div/table/tbody/tr[2]/td/b")).getText();
		System.out.println(text);

	}

}
