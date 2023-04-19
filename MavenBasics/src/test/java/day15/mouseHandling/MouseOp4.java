package day15.mouseHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class MouseOp4 {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome"," https://www.facebook.com/");
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Tom");
		//firstName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		     //or
		act.doubleClick(firstName).perform();
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));

	}

}
