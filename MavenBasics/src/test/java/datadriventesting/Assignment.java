package datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class Assignment extends SeleniumUtility {

	String AppUrl;
	String UserName;
	String Password;

	@BeforeTest
	public void getData() {
		AppUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 1, 0);
		UserName = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 1, 1);
		Password = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 1, 2);
	}

	@Test
	public void VtigerLogin() {
		WebDriver driver = setUp("chrome", AppUrl);

		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.className("buttonBlue")).click();
		if (getCurrentTitleOfApplication("Dashboard").equals("Dashboard")) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 1, 5,
					"Passed");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 1, 4,
					"Dashboard");
		} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 1, 5,
					"Failed");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 1, 4,
					"Dashboard");
		}
		Assert.assertEquals(getCurrentTitleOfApplication(), "Dashboard");

	}
}