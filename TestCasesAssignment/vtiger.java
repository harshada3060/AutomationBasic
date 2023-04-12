package TestCasesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class vtiger {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();

		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.className("buttonBlue")).click();
		driver.findElement(By.xpath("//div[@id='appnavigator']//div[@class='row app-navigator']")).click();
		driver.findElement(By
				.xpath("//div[@class='menu-item app-item dropdown-toggle app-item-color-MARKETING']//div[1]//span[2]"))
				.click();
		driver.findElement(By.xpath("//a[@title='Campaigns']//span[2]")).click();
		driver.findElement(By.cssSelector("#Campaigns_listView_basicAction_LBL_ADD_RECORD>div")).click();
		driver.findElement(By.xpath("//tbody//tr//td[2]//input[@name='campaignname']")).sendKeys("Tree Plantation");
		
		driver.findElement(By.xpath("//tr//td[4]//div//a//span"));
		driver.findElement(By.xpath("//span[@class='input-group-addon']//i")).click();

		driver.findElement(By.xpath("//div[@class='datepicker-days']//tbody//tr[3]//td[3]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//p[@title='All']//a")).click();
		driver.findElement(By.xpath("//div[@class='table-actions']/span/input")).click();
		driver.findElement(By.xpath("//button[@id='Campaigns_listView_massAction_LBL_EDIT']")).click();
		driver.findElement(By.cssSelector("#Campaigns_editView_fieldName_sponsor")).sendKeys("support grouo");
		driver.findElement(By.cssSelector("#Campaigns_editView_fieldName_expectedsalescount")).sendKeys("123");
	
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".table-actions>span>.listViewEntriesCheckBox")).click();
		driver.findElement(By.cssSelector("#Campaigns_listView_massAction_LBL_DELETE")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
	}

}
