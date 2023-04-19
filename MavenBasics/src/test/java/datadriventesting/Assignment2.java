package datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class Assignment2 extends SeleniumUtility {
	String AppUrl;
	String UserName;
	String Password;

	@BeforeTest
	public void getData() {
		AppUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 2, 0);
		UserName = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 2, 1);
		Password = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 2, 2);
	}

	@Test
	public void VtigerLogin2() {
		WebDriver driver = setUp("chrome", AppUrl);

		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.className("buttonBlue")).click();
		if (getCurrentTitleOfApplication("vtiger").equals("Dashboard")) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 2, 5,
					"Passed");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 2, 4,
					"vtiger");
		} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 2, 5,
					"Failed");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 2, 4,
					"vtiger");
		}
		Assert.assertEquals(getCurrentTitleOfApplication(),"Dashboard");

	}
}

