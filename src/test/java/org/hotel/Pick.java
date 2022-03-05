package org.hotel;

import org.hai.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pick extends BaseClass{
	public Pick() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement selecthotel;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement conti;

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getConti() {
		return conti;
	}

}
