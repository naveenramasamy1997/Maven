package org.hotel;

import org.hai.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	
	
	
	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	BaseClass base = new BaseClass();
      public void Loginpage(String txtusername,String txtpassword) {
		WebElement txtusername2 = getTxtusername();
	
		base.sendkeys(txtusername2, txtusername);
		
base.click(btnlogin);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
