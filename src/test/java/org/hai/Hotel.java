package org.hai;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hotel {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

	}

	@AfterClass
	public static void afterClass() {

		driver.quit();

	}

	@Before
	public void beforeMethod() {
		long start = System.currentTimeMillis();
		System.out.println(start);

	}

	@After
	public void afterMethod() {
		long end = System.currentTimeMillis();
		System.out.println(end);

	}

	@Test
	public void login() {

		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("naveen53");

		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("C1IZAU");

		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();

	}


}
