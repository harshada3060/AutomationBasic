package TestCasesAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class orangeHrmPIM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtility.setUp("chrome",
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[2]//a")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-header-container']//button")).click();
		driver.findElement(By.name("firstName")).sendKeys("Rudra");
		driver.findElement(By.name("lastName")).sendKeys("patil");
		driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[2]//input"))
				.sendKeys("001");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[2]//a")).click();
		driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[2]//div[2]//input")).sendKeys("0269001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath(
				"//div[@class='oxd-table-body']//div//div[@class='oxd-table-cell oxd-padding-cell']//div//label//span//i"))
				.click();
		driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']//button[2]//i")).click();

		driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[6]//a")).click();
		driver.findElement(By.xpath("//div[text()='-- Select --']")).click();

		driver.findElement(By.xpath("//div[text()='-- Select --']")).sendKeys("QA Lead");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[@class='oxd-form-actions']//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"))
				.click();
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[2]//a")).click();
		driver.findElement(By.xpath("//div[2][@class='oxd-grid-item oxd-grid-item--gutters']//input"))
				.sendKeys("0269001");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By
				.xpath("//div[@class='oxd-table-header-cell oxd-padding-cell oxd-table-th' and @role='columnheader']"))
				.click();
		driver.findElement(By.xpath(
				"//div[@class='oxd-table-cell-actions']/button[@class='oxd-icon-button oxd-table-cell-action-space']"))
				.click();
		driver.findElement(By.xpath("//div[@class='orangehrm-modal-footer']/button[2]/i")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[2]//a")).click();

	}

}
