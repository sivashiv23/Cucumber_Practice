package com.pagefactory;

import org.cucumber.Cucumber.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Paymentgatewaypf {
	public Paymentgatewaypf() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(xpath = "//a[text()='Payment Gateway Project']")
	private WebElement payment_page;

	@FindBy(xpath = "(//a[text()='Generate Card Number'])[1]")
	private WebElement generate_card;

	@FindBy(xpath = "//h4[contains(text(),'Card Number:-')]")
	private WebElement card_number;

	@FindBy(xpath = "//h4[contains(text(),'CVV:-')]")
	private WebElement cvv;

	@FindBy(xpath = "//h4[contains(text(),'Exp:-')]")
	private WebElement Exp;

	@FindBy(xpath = "//*[@id=\"three\"]/div/h4[4]")
	private WebElement creditlimit;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//input[@id='card_nmuber']")
	private WebElement excardnumber;

	@FindBy(id = "month")
	private WebElement exmonth;

	@FindBy(id = "year")
	private WebElement exyear;

	@FindBy(id = "cvv_code")
	private WebElement excvv;

	@FindBy(name = "submit")
	private WebElement paysubmit;

	@FindBy(xpath="//*[@id=\"three\"]/div/div/table/tbody/tr[1]/td[2]/h3/strong")
	private WebElement orderid;
	
	public WebElement getOrderid() {
		return orderid;
	}

	public void setOrderid(WebElement orderid) {
		this.orderid = orderid;
	}

	public WebElement getPaysubmit() {
		return paysubmit;
	}

	public void setPaysubmit(WebElement paysubmit) {
		this.paysubmit = paysubmit;
	}

	public WebElement getExcardnumber() {
		return excardnumber;
	}

	public void setExcardnumber(WebElement excardnumber) {
		this.excardnumber = excardnumber;
	}

	public WebElement getExmonth() {
		return exmonth;
	}

	public void setExmonth(WebElement exmonth) {
		this.exmonth = exmonth;
	}

	public WebElement getExyear() {
		return exyear;
	}

	public void setExyear(WebElement exyear) {
		this.exyear = exyear;
	}

	public WebElement getExcvv() {
		return excvv;
	}

	public void setExcvv(WebElement excvv) {
		this.excvv = excvv;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public WebElement getCreditlimit() {
		return creditlimit;
	}

	public void setCreditlimit(WebElement creditlimit) {
		this.creditlimit = creditlimit;
	}

	public WebElement getExp() {
		return Exp;
	}

	public void setExp(WebElement exp) {
		Exp = exp;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public WebElement getCard_number() {
		return card_number;
	}

	public void setCard_number(WebElement card_number) {
		this.card_number = card_number;
	}

	public WebElement getPayment_page() {
		return payment_page;
	}

	public void setPayment_page(WebElement payment_page) {
		this.payment_page = payment_page;
	}

	public WebElement getGenerate_card() {
		return generate_card;
	}

	public void setGenerate_card(WebElement generate_card) {
		this.generate_card = generate_card;
	}

}
