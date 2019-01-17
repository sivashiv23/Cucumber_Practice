package org.cucumber.Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariff {

	static WebDriver driver;

	@Given("the user navigate to Add Tariff plan")
	public void the_user_navigate_to_Add_Tariff_plan() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("the user fills the tariff details {string}, {string}, {string}, {string}, {string}, {string},{string}")
	public void the_user_fill_in_the_plan_details(String Monthrent, String freeLoc, String freeInt, String freeSMS,
			String LocCharges, String intCharges, String smsCharges) {
		driver.findElement(By.id("rental1")).sendKeys(Monthrent);
		driver.findElement(By.id("local_minutes")).sendKeys(freeLoc);
		driver.findElement(By.id("inter_minutes")).sendKeys(freeInt);
		driver.findElement(By.id("sms_pack")).sendKeys(freeSMS);
		driver.findElement(By.id("minutes_charges")).sendKeys(LocCharges);
		driver.findElement(By.id("inter_charges")).sendKeys(intCharges);
		driver.findElement(By.id("sms_charges")).sendKeys(smsCharges);

	}

	@Then("The user should see the success message")
	public void the_user_should_see_the_success_message() {

		Assert.assertEquals("Congratulation you add Tariff Plane",
				driver.findElement(By.xpath("//section[@id='main']//h2")).getText());
	}
}
