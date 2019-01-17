package com.pagefactory;

import org.cucumber.Cucumber.Hook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckCreditpf {
	public CheckCreditpf()
	{
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Check Credit Card Limit'])[1]")
	private WebElement check_credit;
	
	@FindBy(xpath="//input[@id='card_nmuber']")
	private WebElement cccardnum;
	
	@FindBy(xpath="//input[@value='submit']")
	private WebElement credit_submit;
	
	@FindBy(xpath="//div[@class='table-wrapper']")
	private WebElement creditbalance_order;
	
	public WebElement getCreditbalance_order() {
		return creditbalance_order;
	}

	public void setCreditbalance_order(WebElement creditbalance_order) {
		this.creditbalance_order = creditbalance_order;
	}

	public WebElement getCredit_submit() {
		return credit_submit;
	}

	public void setCredit_submit(WebElement credit_submit) {
		this.credit_submit = credit_submit;
	}

	public WebElement getCccardnum() {
		return cccardnum;
	}

	public void setCccardnum(WebElement cccardnum) {
		this.cccardnum = cccardnum;
	}

	public WebElement getCheck_credit() {
		return check_credit;
	}

	public void setCheck_credit(WebElement check_credit) {
		this.check_credit = check_credit;
	}

	public WebElement getPayment_page() {
		return payment_page;
	}

	public void setPayment_page(WebElement payment_page) {
		this.payment_page = payment_page;
	}

	@FindBy(xpath = "//a[text()='Payment Gateway Project']")
	private WebElement payment_page;

}
