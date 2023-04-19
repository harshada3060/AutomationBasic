package day15.mouseHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class flipcartEx {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome","https://www.flipkart.com/");
		// using Escape of keyboard to avoid login popup		
       driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
       List<WebElement> menu = driver.findElements(By.xpath("//div[@class='_37M3Pb']//a//div[@class='xtXmba']"));
       System.out.println("Menu count in FlipCart:"+menu.size());
       Actions act = new Actions(driver);
       for(int i=0;i<menu.size();i++) {
       act.moveToElement(menu.get(i)).perform();
       System.out.println( "menu name are:"+menu.get(i).getText());
       }
	}
	
}