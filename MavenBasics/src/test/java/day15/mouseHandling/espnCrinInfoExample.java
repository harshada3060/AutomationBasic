package day15.mouseHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class espnCrinInfoExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.espncricinfo.com/");

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);

		List<WebElement> menuData = driver.findElements(
				By.xpath("//div[@class='ds-flex ds-items-center ds-justify-between ds-flex-1']//div//div//a"));

		System.out.println("Main menu option count :  " + menuData.size());

		// create instance of Actions class

		Actions act = new Actions(driver);

		for (int i = 0; i < menuData.size(); i++) {

			System.out.println("option name  : " + menuData.get(i).getText());

			act.moveToElement(menuData.get(i)).perform();

			Thread.sleep(1000);

		}

	}

}
