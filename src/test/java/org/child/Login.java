package org.child;

import java.io.IOException;

import org.hai.BaseClass;
import org.hotel.Details;
import org.hotel.LoginPage;
import org.hotel.Order;
import org.hotel.Pick;
import org.hotel.SearchHotel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		
		BaseClass base = new BaseClass();
		
		base.getDriver();
		base.UrlLaunch("https://adactinhotelapp.com/");
		
		LoginPage page = new LoginPage();
		
		WebElement txtusername = page.getTxtusername();
		String getdata = base.getdata("datas", 1, 0);
		base.sendkeys(txtusername, getdata);
		
		WebElement txtpassword = page.getTxtpassword();
		String getdata2 = base.getdata("datas",1, 1);
		base.sendkeys(txtpassword,getdata2);
		
		WebElement btnlogin = page.getBtnlogin();
		base.click(btnlogin);
		
		SearchHotel hotel = new SearchHotel();
		
		WebElement dropdownlocation = hotel.getDropdownlocation();
		Select select = new Select(dropdownlocation);
		base.selectOptionByIndex(dropdownlocation, 1);
		
		
		WebElement dropdownHotel = hotel.getDropdownHotel();
		Select select1 = new Select(dropdownHotel);
		base.selectOptionByIndex(dropdownHotel, 2);
		
		WebElement dropdowntype = hotel.getDropdowntype();
		Select s = new Select(dropdowntype);
		base.selectOptionByIndex(dropdowntype, 1);
		
		WebElement dropdownnos = hotel.getDropdownnos();
		Select c = new Select(dropdownnos);
		base.selectOptionByIndex(dropdownnos, 2);
		
		WebElement dropdownadult = hotel.getDropdownadult();
		Select y = new Select(dropdownadult);
		base.selectOptionByIndex(dropdownadult, 1);
		
		
		WebElement dropdownchild = hotel.getDropdownchild();
		Select d = new Select(dropdownchild);
		base.selectOptionByIndex(dropdownchild, 2);
		
		
		WebElement dropdownsubmit = hotel.getDropdownsubmit();
		base.click(dropdownsubmit);
		
		
		Pick pick = new Pick();
		WebElement selecthotel = pick.getSelecthotel();
		base.click(selecthotel);
		
		WebElement conti = pick.getConti();
		base.click(conti);
		
		Details detail = new Details();
		
		WebElement firstName = detail.getFirstName();
		String getdata3 = base.getdata("datas", 1, 2);
		base.sendkeys(firstName,getdata);
		
		
		WebElement lastName = detail.getLastName();
		String getdata4 = base.getdata("datas", 1, 3);
		base.sendkeys(lastName, getdata4);
		
		WebElement address = detail.getAddress();
		String ll = base.getdata("datas", 1, 4);
		base.sendkeys(address, ll);
		
		WebElement cardNo = detail.getCardNo();
		String getdata5 = base.getdata("datas", 1, 5);
		base.sendkeys(cardNo, getdata5);
		
		WebElement cardType = detail.getCardType();
		Select v = new Select(cardType);
		base.selectOptionByIndex(cardType, 1);
		
		
		
		WebElement cardMonth = detail.getCardMonth();
		Select q= new Select(cardMonth);
		base.selectOptionByIndex(cardMonth, 1);
		
		
		WebElement cardYear = detail.getCardYear();
		Select w= new Select(cardYear);
				base.selectOptionByIndex(cardYear, 9);
		
		WebElement cardCcv = detail.getCardCcv();
		String getdata9 = base.getdata("datas", 1, 6);
		base.sendkeys(cardCcv, getdata9);
		
		
		WebElement btnbookNow = detail.getBtnbookNow();
		base.click(btnbookNow);
		
		
		base.implicityWait(300);
		Order b = new Order();
		WebElement order = b.getOrder();
		String attribute = base.getAttribute(order);
		
		base.writeData("datas", 1, 7, attribute);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
