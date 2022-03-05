package org.hai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		File file = new File ("C:\\Users\\Naveen\\eclipse-workspace frame\\MavenClass\\excel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(stream);
		XSSFSheet sheet = book.getSheet("datas");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			XSSFRow row = sheet.getRow(i);
			System.out.println(" ");
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				XSSFCell cells = row.getCell(j);

				CellType type = cells.getCellType();
				
				switch (type) {
				case STRING:
					String value = cells.getStringCellValue();
					System.out.println(value);

					break;

				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cells)) {
						Date cellValue = cells.getDateCellValue();
						SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
						String format = f.format(cellValue);
						System.out.println(format);
						
					} else {

					}
					double value2 = cells.getNumericCellValue();
					BigDecimal of = BigDecimal.valueOf(value2);
					String string = of.toString();
					
			System.out.println(string);

					break;
				default:
					break;
					
				}
			}

		}



	}
}


