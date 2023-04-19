package datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class OrangeHrmAss1 extends SeleniumUtility{
	String AppUrl;
	String UserName;
	String Password;

	@BeforeTest
	public void getData() {
		AppUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 5, 0);
		UserName = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 5, 1);
		Password = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 5, 2);
	}

	@Test
	public void VtigerLogin2() {
		WebDriver driver = setUp("chrome", AppUrl);

		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(UserName);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.className("oxd-button")).click();
		if (getCurrentTitleOfApplication("OrangeHRM").equals("OrangeHRM")) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 5, 5,
					"Passed");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 5, 4,
					"OrangeHRM");
		} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 5, 5,
					"Failed");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 5, 4,
					"OrangeHRM");
		}
		Assert.assertEquals(getCurrentTitleOfApplication(),"OrangeHRM");

	}
}



