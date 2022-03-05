package org.hai;

import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.text.Element;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


	import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
	import java.util.List;
	import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import org.apache.commons.io.FileUtils;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;



import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {

		public static WebDriver driver;

		// Webdriver
		public WebDriver getDriver() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;
		}

		// URL Launch
		public void UrlLaunch(String url) {
			driver.get(url);
		}

		// Sendkeys
		public void sendkeys(WebElement element, String text) {
			element.sendKeys(text);
		}

		// LocatorByID
		public WebElement findElementById(String attributevalue) {
			WebElement element = driver.findElement(By.id(attributevalue));
			return element;
		}

		// LocatorByName
		public WebElement findlocatorByName(String attributevalue) {
			WebElement element = driver.findElement(By.name(attributevalue));
			return element;
		}

		// LocatorbyXpath
		public WebElement findElementByXpath(String Xpath) {
			WebElement element = driver.findElement(By.xpath(Xpath));
			return element;
		}

		// LocatorBycalssName
		public WebElement findElementByClassName(String attribute) {
			WebElement element = driver.findElement(By.className(attribute));
			return element;
		}

		public List<WebElement> findlocaterbytagName(String tagName) {
			 List<WebElement> findElements = driver.findElements(By.tagName(tagName));
			return findElements;
			

		}
		
		
		
		// Get Text
		public String getText(WebElement element) {
			String text = element.getText();
			return text;
		}

		// GetAttribute -type1
		public String getAttribute(WebElement element) {
			String text = element.getAttribute("value");
			return text;
		}

		// GetAttribute -Type2
		public String getAttribute(WebElement element, String string) {
			String text = element.getAttribute(string);
			return text;
		}

		// GetTitle
		public String getTitle() {
			String text = driver.getTitle();
			return text;
		}

		// GetCurrentUrl
		private String getCurrentUrl() {
			String text = driver.getCurrentUrl();
			return text;
		}

		// SelectOptionByText
		public void selectOptionByText(WebElement element, String text) {
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}

		// SelectoptionByIndex
		public void selectOptionByIndex(WebElement element, int index) {
			new Select(element).selectByIndex(index);
		}

		// SelectOptionByAttributeValue
		public void selectOptionByAttributeValue(WebElement element, String value) {
			new Select(element).selectByValue(value);
		}

		// TyPE JS
		public void typeJs(WebElement element, String text) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("argument[0].setAttribute('value'," + text + "')", element);
		}

		// Navigate
		public void navigate(String url) {
			driver.navigate().to(url);
		}

		// forward-Navigate
		public void forward() {
			driver.navigate().forward();
		}

		// Back-Navigate
		public void back() {
			driver.navigate().back();
		}

		// Refresh-Navigate
		public void refresh() {
			driver.navigate().refresh();
		}

		// Maximize
		public void maximize() {
			driver.manage().window().maximize();
		}
		public void clear(WebElement element) {
			element.clear();

		}

		// Minimize
		public void minimize() {
			driver.manage().window().minimize();
		}

		// FullScreen
		public void fullscreen() {
			driver.manage().window().fullscreen();
		}

	

		// MouseOverAction-movetotheelement
		public void moveToTheElement(WebElement element) {
			Actions actions = new Actions(driver);
			actions.moveToElement(element).perform();
		}

		// MouseOverAction-Click
		public void click(WebElement element) {
			element.click();
		}

		// dragAndDrop
		public void drapAndDrop(WebElement element, WebElement element2) {
			Actions actions = new Actions(driver);
			actions.dragAndDrop(element, element2);
		}

		// DoubleClick
		public void doubleClick(WebElement element) {
			Actions actions = new Actions(driver);
			actions.doubleClick(element);
		}

		// Context Click
		public void contextClick(WebElement element) {
			Actions actions = new Actions(driver);
			actions.contextClick(element).perform();
		}

		// KEY UP
		public void keyUp(String key) {
			Actions actions = new Actions(driver);
			actions.keyUp(key);
		}

		// Click ok
		public void accept() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}

		// Confirm Alert
		public void dismiss() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}

		// PromptAlert
		public void promptAlert(String text) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
			alert.accept();
		}

		// ScreenShot-Syntax
		public void getScreenshot(String path) throws IOException {
			TakesScreenshot screenshot = (TakesScreenshot) driver;

			File source = screenshot.getScreenshotAs(OutputType.FILE);
			File Destination = new File(path);
			FileUtils.copyFile(source, Destination);

		}

		// Js Click
		public void jsClick(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("argument[0].click()", element);
		}

		// ScrollDown
		public void scrollDown(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("argument[0].scrollIntoView(true)", element);
		}

		// ScrollDown
		public void scrollUp(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("argument[0].scrollIntoView(false)", element);
		}

		// DropDown-getoptions
		public List getOptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> list = select.getOptions();
			return list;
		}

		// allselectedoption
		public List getAllSelectedOptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> list = select.getAllSelectedOptions();
			return list;
		}

		// firstselectedoption
		public WebElement getFirstSelectedOption(WebElement element) {
			Select select = new Select(element);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			return firstSelectedOption;
		}

		// is Multiple
		public boolean isMultiple(WebElement element) {
			Select select = new Select(element);
			boolean multiple = select.isMultiple();
			return multiple;
		}

		// deselectbyindex
		public void deselectByIndex(WebElement element, int index) {
			Select select = new Select(element);
			select.deselectByIndex(index);
		}

		// deselectbyVisibletext
		public void deselectByVisibleText(WebElement element, String text) {
			Select select = new Select(element);
			select.deselectByVisibleText(text);
		}

		// deselectall
		public void deselectAll(WebElement element) {
			Select select = new Select(element);
			select.deselectAll();
		}

		// deselectbyvalue
		public void deselectByValue(WebElement element, String value) {
			Select select = new Select(element);
			select.deselectByValue(value);
		}

		// Framebyid
		public void frameId(String nameOrId) {
			driver.switchTo().frame(nameOrId);
		}

		// FrameElement
		public void frameElement(WebElement element) {
			driver.switchTo().frame(element);
		}

		// FrameIndex
		public void frameIndex(int index) {
			driver.switchTo().frame(index);
		}

		// returnframe
		private void returnFrame() {
			driver.switchTo().defaultContent();
		}

		// parentframe
		public void parentFrame() {
			driver.switchTo().parentFrame();
		}

		// WindowsHandle-parent
		public String getWindowHandle() {
			String windowHandle = driver.getWindowHandle();
			return windowHandle;
		}

		// WindowsHandle-parent,child
		public Set<String> getWindowHandles() {
			Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;
		}

		// implicit wait
		public void implicitWait(int sec) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		}

		// WebDriverWait
		public void webDriverWait(int seconds) {
			WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		}
		public void fileInputStream(String path) throws FileNotFoundException {
			File file = new File(path);
			FileInputStream stream = new FileInputStream(file);
		}

		public void workBook(String path) {
			File file = new File(path);
			Workbook workbook = new XSSFWorkbook();
		}

		public void createSheet(String path) {
			Workbook workbook = new XSSFWorkbook();
			org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet();
		}


		public void implicityWait(int a) {
			driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
		}

		public void fluent() { // 62
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(0))
					.pollingEvery(Duration.ofSeconds(0)).ignoring(NoSuchElementException.class);
		}
		
		public String getdata(String SheetName, int rownum, int cellnum) throws IOException {
			String res = null;
			File file = new File("C:\\Users\\Naveen\\eclipse-workspace frame\\MavenClass\\excel\\adactinhotel.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(SheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			CellType type = cell.getCellType();
			switch (type) {
			case STRING:
				res = cell.getStringCellValue();
				break;

			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
					res = dateformat.format(dateformat);
				} else {
					double d = cell.getNumericCellValue();
					BigDecimal num = BigDecimal.valueOf(d);
					res = num.toString();
				}
			default:
				break;
			}
			return res;

		}
		
	
		public void writeData(String sheetname, int rownum, int cellnum, String text) throws IOException {
			String res = null;
			File file = new File("C:\\Users\\Naveen\\eclipse-workspace frame\\MavenClass\\excel\\adactinhotel.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(rownum);
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(text);
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);
		}	
		
		public List webTable(WebElement element,int rownum,int cellnum,String value) {
			WebElement table = driver.findElement(By.id("customers"));

			List<WebElement> elements = table.findElements(By.tagName("tr"));
			List<WebElement> elements2 = table.findElements(By.tagName("td"));
			WebElement webElement = elements.get(6);
			String text2 = webElement.getText();
			return elements2;

		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}