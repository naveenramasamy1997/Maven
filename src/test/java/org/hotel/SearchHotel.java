package org.hotel;

import org.hai.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement dropdownlocation;
	
	@FindBy(id="hotels")
	private WebElement dropdownHotel;
	
	@FindBy(id="room_type")
	private WebElement dropdowntype;
	
	@FindBy(id="room_nos")
	private WebElement dropdownnos;
	
	@FindBy(id="adult_room")
	private WebElement dropdownadult;
	
	public WebElement getDropdownlocation() {
		return dropdownlocation;
	}

	public WebElement getDropdownHotel() {
		return dropdownHotel;
	}

	public WebElement getDropdowntype() {
		return dropdowntype;
	
	}

	public WebElement getDropdownnos() {
		return dropdownnos;
	}

	public WebElement getDropdownadult() {
		return dropdownadult;
	}

	public WebElement getDropdownchild() {
		return dropdownchild;
	}

	public WebElement getDropdownsubmit() {
		return dropdownsubmit;
	}

	@FindBy(id="child_room")
	private WebElement dropdownchild;
	
	@FindBy(id="Submit")
	private WebElement dropdownsubmit;
	
	}


