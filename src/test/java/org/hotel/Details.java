package org.hotel;

import org.hai.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details extends BaseClass {
	public Details() {
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement cardNo;
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardType;
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement cardMonth;
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement cardYear;
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cardCcv;
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement btnbookNow;
	
	
	
	
	
	public WebElement getFirstName() {
		return firstName;
	}





	public WebElement getLastName() {
		return lastName;
	}





	public WebElement getAddress() {
		return address;
	}





	public WebElement getCardNo() {
		return cardNo;
	}





	public WebElement getCardType() {
		return cardType;
	}





	public WebElement getCardMonth() {
		return cardMonth;
	}





	public WebElement getCardYear() {
		return cardYear;
	}





	public WebElement getCardCcv() {
		return cardCcv;
	}





	public WebElement getBtnbookNow() {
		return btnbookNow;
	}





	{


	}
	
	
	
	
}