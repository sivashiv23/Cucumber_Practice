package org.cucumber.Cucumber;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pagefactory.Paymentgatewaypf;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Paymentgateway {
	Paymentgatewaypf paypf = new Paymentgatewaypf();

	@Given("The user should generate the new card")

	public void the_user_should_generate_the_new_card() throws IOException {

		Hook.driver.manage().window().maximize();
		Hook.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// to navigate to generate card page
		paypf.getPayment_page().click();
		// to navigate to the generate card page
		paypf.getGenerate_card().click();

//Switching to next window
		String pwid = Hook.driver.getWindowHandle();
		System.out.println("parent " + pwid);
		Set<String> cwid = Hook.driver.getWindowHandles();
		for (String i : cwid) {
			if (!pwid.equals(i)) {
				Hook.driver.switchTo().window(i);
			}

		}
		System.out.println("cwin" + cwid);

	}

	@Then("store the card details")
	public void store_the_card_details() throws IOException {
		String cardnum = (String) paypf.getCard_number().getText().substring(14);

		String cvv = (String) paypf.getCvv().getText().substring(6);

		String expmonth = (String) paypf.getExp().getText().substring(6, 8);

		String expyear = (String) paypf.getExp().getText().substring(9);

		String cl = (String) paypf.getCreditlimit().getText().substring(14);

		// for file operation add maven dependency
		File loc = new File("C:\\Users\\sb61\\eclipse-workspace\\sivaws\\Cucumber\\ExcelResource\\Card_Details.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet("Sheet1");
		Row row = sheet.createRow(0);
		Cell c1 = row.createCell(0);
		c1.setCellValue(cardnum);
		Cell c2 = row.createCell(1);
		c2.setCellValue(cvv);
		Cell c3 = row.createCell(2);
		c3.setCellValue(expmonth);
		Cell c4 = row.createCell(3);
		c4.setCellValue(expyear);
		Cell c5 = row.createCell(4);
		c5.setCellValue(cl);

		FileOutputStream op = new FileOutputStream(loc);
		w.write(op);
		System.out.println("done");

	}

	@Given("user navigates to payment gateway page")
	public void user_navigates_to_payment_gateway_page() {
		paypf.getPayment_page().click();
	}

	@When("User should choose the quantity of the item")
	public void user_should_choose_the_quantity_of_the_item() {

		// to select the quantity
		WebElement quantity = Hook.driver.findElement(By.xpath("//select[@name='quantity']"));
		Select s = new Select(quantity);
		s.selectByValue("1");

	}

	@When("User click on buynow option")
	public void user_click_on_buynow_option() {
		paypf.getSubmit().click();
	}

	@Then("User enters the 	card number,expiration month,expiration year,cvv code")
	public void user_enters_the_card_number_expiration_month_expiration_year_cvv_code() throws IOException {

		// excel file location
		File loc = new File("C:\\Users\\sb61\\eclipse-workspace\\sivaws\\Cucumber\\ExcelResource\\Card_Details.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		String cardnum = (String) row.getCell(0).getStringCellValue();

		String cvv = (String) row.getCell(1).getStringCellValue();
		String expmonth = (String) row.getCell(2).getStringCellValue();
		String expyear = (String) row.getCell(3).getStringCellValue();
		String cl = (String) row.getCell(4).getStringCellValue();

		paypf.getExcardnumber().sendKeys(cardnum);

		paypf.getExmonth().sendKeys(expmonth);

		paypf.getExyear().sendKeys(expyear);

		paypf.getExcvv().sendKeys(cvv);

	}

	@Then("User clicks on pay")
	public void user_clicks_on_pay() {
		paypf.getPaysubmit().click();
	}

	@Then("The message Payment successfull! is displayed")
	public void the_message_Payment_successfull_is_displayed() {
		System.out.println("Order id "+paypf.getOrderid().getText());
		
	}

}
