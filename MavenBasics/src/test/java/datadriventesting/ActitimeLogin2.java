package datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class ActitimeLogin2 extends SeleniumUtility {
	String AppUrl;
	String UserName;
	String Password;

	@BeforeTest
	public void getData() {
		AppUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 0);
		UserName = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 1);
		Password = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 2);
	}

	@Test
	public void actitimeLogin() {
		WebDriver driver = setUp("chrome", AppUrl);
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.name("pwd")).sendKeys(Password);
		driver.findElement(By.id("loginButton")).click();
		if (getCurrentTitleOfApplication("actiTIME - Login").equals("actiTIME - Enter Time-Track")) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 5,
					"Passed");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 4,
					"actiTIME - Login");
		} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 5,
					"Failed");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 4,
					"actiTIME - Login");
		}
		Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME - Enter Time-Track");
	}

	@AfterTest
	public void cleanUp1() {
		cleanUp();
	}
}
