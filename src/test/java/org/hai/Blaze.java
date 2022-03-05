package org.hai;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Blaze {
	public static void main(String[] args) throws IOException {
		BaseClass base= new BaseClass();
		
		base.getDriver();
		base.UrlLaunch("https://blazedemo.com/");
		
		
		WebElement from = base.findlocatorByName("fromPort");
		
		base.selectOptionByIndex(from, 1);
		
		
		WebElement to = base.findlocatorByName("toPort");
		base.selectOptionByIndex(to, 2);
		
		
		WebElement btnlogin = base.findElementByXpath("//input[@type=\"submit\"]");
		base.click(btnlogin);
		
		
		
		WebElement clickflight = base.findElementByXpath("(//input[@type=\"submit\"])[3]");
		base.click(clickflight);
		
		
		WebElement firstname = base.findElementById("inputName");
		String first = base.getdata("blaze", 1, 0);
		base.sendkeys(firstname, first);
		
		
		WebElement address = base.findElementById("address");
		String add= base.getdata("blaze", 1, 1);
		base.sendkeys(address, add);
		
		
		WebElement city = base.findElementById("city");
		String citi = base.getdata("blaze", 1, 2);
	    base.sendkeys(city, citi);
		
		
		WebElement state = base.findElementByXpath("//input[@placeholder=\"State\"]");
		String states = base.getdata("blaze", 1, 3);
		base.sendkeys(state, states);
		
		WebElement code = base.findElementById("zipCode");
		String zip = base.getdata("blaze", 1, 4);
		base.sendkeys(code, zip);
		
		
		
		WebElement cardtype = base.findElementById("cardType");
		base.selectOptionByIndex(cardtype, 2);
		
		
		WebElement ccn = base.findElementById("creditCardNumber");
		String creditnum = base.getdata("blaze",1 ,5 );
		base.sendkeys(ccn, creditnum);
		
		
		
		
		WebElement ccm = base.findElementById("creditCardMonth");
		String month = base.getdata("blaze", 1, 6);
		base.sendkeys(ccm, month);
		
		
		
		
		WebElement ccy = base.findElementById("creditCardYear");
		String year = base.getdata("blaze", 1, 7);
		base.sendkeys(ccy, year);
		
		
		
		
		WebElement name = base.findElementById("nameOnCard");
		String card = base.getdata("blaze", 1, 8);
		base.sendkeys(name, card);
		
		
		WebElement btnsubmit = base.findElementByXpath("//input[@value=\"Purchase Flight\"]");
		base.click(btnsubmit);
	

		
		WebElement order = base.findElementByXpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]");
		String text = base.getText(order);
		base.writeData("blaze", 1,9 , text);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
