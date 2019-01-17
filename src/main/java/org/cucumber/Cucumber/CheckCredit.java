package org.cucumber.Cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.pagefactory.CheckCreditpf;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckCredit {
	CheckCreditpf ccp = new CheckCreditpf();

	@Given("User should be in guru telecom homepage")
	public void user_should_be_in_guru_telecom_homepage() {
		System.out.println("Check Credit Function");
	}

	@Given("user navigate to the payment gateway project")
	public void user_navigate_to_the_payment_gateway_project() {
		ccp.getPayment_page().click();
	}

	@Given("user clicks on the check credit balance")
	public void user_clicks_on_the_check_credit_balance() {
		ccp.getCheck_credit().click();
	}

	@When("user has to provide the card number")
	public void user_has_to_provide_the_card_number() throws IOException {
		// excel file location
		File loc = new File("C:\\Users\\sb61\\eclipse-workspace\\sivaws\\Cucumber\\ExcelResource\\Card_Details.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		String cardnum = (String) row.getCell(0).getStringCellValue();
		ccp.getCccardnum().sendKeys(cardnum);
	}

	@When("user click on submit")
	public void user_click_on_submit() {
		ccp.getCredit_submit().click();
	}

	@Then("user should see the credit balance on the provided card number")
	public void user_should_see_the_credit_balance_on_the_provided_card_number() {
		System.out.println(ccp.getCreditbalance_order().getText());
	}
}
