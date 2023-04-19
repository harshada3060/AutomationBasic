package day1aprilswitchstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class Assignment {

	public static void main(String[] args) throws InterruptedException    {

		WebDriver driver = SeleniumUtility.setUp("chrome","https://jqueryui.com/");

		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		WebElement item1 = driver.findElement(By.xpath("//ul[@id='sortable']//li[1]"));
		WebElement item2 = driver.findElement(By.xpath("//ul[@id='sortable']//li[2]"));
		WebElement item3 = driver.findElement(By.xpath("//ul[@id='sortable']//li[3]"));
		WebElement item4 = driver.findElement(By.xpath("//ul[@id='sortable']//li[4]"));
		WebElement item5 = driver.findElement(By.xpath("//ul[@id='sortable']//li[5]"));
		WebElement item6 = driver.findElement(By.xpath("//ul[@id='sortable']//li[6]"));
		WebElement item7 = driver.findElement(By.xpath("//ul[@id='sortable']//li[7]"));
		act.dragAndDrop(item6, item1);

		act.dragAndDrop(item7, item1).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(item6, item1).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(item5, item1).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(item4, item1).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(item3, item1).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(item2, item1).build().perform();
		Thread.sleep(1000);
	}

}
