package org.hai;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Adactin {
	public static void main(String[] args) throws IOException {
		
		BaseClass base= new BaseClass();
		
		base.getDriver();
		
		base.UrlLaunch("https://adactinhotelapp.com/");
		base.maximize();
		
		
		WebElement txtuser = base.findElementById("username");
		String data = base.getdata("datas", 1, 0);
	    base.sendkeys(txtuser, data);
		
		
		WebElement txtpassword = base.findElementById("password");
	    String pass = base.getdata("datas", 1, 1);
	    base.sendkeys(txtpassword, pass);
		
		WebElement btnlogin = base.findElementById("login");
	    base.click(btnlogin);
	    
	    WebElement Ddnlocation = base.findElementById("location");
	    base.click(Ddnlocation);
	    base.selectOptionByIndex(Ddnlocation, 3);
		
		
		WebElement Ddnhotel = base.findElementById("hotels");
		base.click(Ddnhotel);
		base.selectOptionByIndex(Ddnhotel, 2);
		
		
		WebElement Ddnroom = base.findElementById("room_type");
		base.click(Ddnroom);
		
		WebElement roomnoDdn = base.findElementById("room_nos");
		base.click(roomnoDdn);
		base.selectOptionByIndex(roomnoDdn, 1);
		
	//	WebElement txtcheckin = base.findElementById("datepick_in");
		//base.clear(txtcheckin);
		//String in = base.getdata("datas", 1, 2);
		//base.sendkeys(txtcheckin, in);
		
		
	//	WebElement txtcehckout = base.findElementById("datepick_out");
		//base.clear(txtcehckout);
	//	String out = base.getdata("datas", 1, 3);
		//base.sendkeys(txtcehckout, out);
		
		
		
		
		WebElement Ddnadultroom = base.findElementById("adult_room");
		base.click(Ddnadultroom);
		base.selectOptionByIndex(Ddnadultroom, 1);
		
		
		WebElement Ddnchildroom = base.findElementById("child_room");
		base.click(Ddnchildroom);
		base.selectOptionByIndex(Ddnchildroom, 1);
		
		
		
		WebElement btnsearch = base.findElementById("Submit");
		base.click(btnsearch);
		
		WebElement hotelclk = base.findElementById("radiobutton_1");
		base.click(hotelclk);
		
		WebElement continueclk = base.findElementById("continue");
		base.click(continueclk);
		
		WebElement firstname = base.findElementById("first_name");
		String first = base.getdata("datas", 1, 2);
		base.sendkeys(firstname,first);
		
		
		WebElement lastname = base.findElementById("last_name");
		String last = base.getdata("datas", 1, 3);
		base.sendkeys(lastname, last);
		
		
		WebElement address = base.findElementById("address");
		String string = base.getdata("datas", 1, 4);
		
		base.sendkeys(address,string);
		
		
		
		WebElement txtcard = base.findElementById("cc_num");
		String text = base.getdata("datas", 1,5);
		base.sendkeys(txtcard, text);
		
		
		WebElement cardtype = base.findElementById("cc_type");
		base.click(cardtype);
		base.selectOptionByIndex(cardtype, 1);
		
		

		WebElement month = base.findElementById("cc_exp_month");
		base.click(month);
		base.selectOptionByIndex(month, 3);

		WebElement Ddnyear = base.findElementById("cc_exp_year");
		base.click(Ddnyear);
		base.selectOptionByIndex(Ddnyear, 12);
		
		WebElement txtccv = base.findElementById("cc_cvv");
		String getdata = base.getdata("datas",1 ,6);
		base.sendkeys(txtccv, getdata);
		
		WebElement btnbook = base.findElementById("book_now");
		base.click(btnbook);
		
		
		
		base.implicitWait(300);
		
		WebElement orderno = base.findElementById("order_no");
		String attribute = base.getAttribute(orderno);
		base.writeData("datas",1 ,7 , attribute);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
