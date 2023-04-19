package day14.xpathExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class DependentIndependentAmazon {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome","https://www.amazon.in/");
		driver.findElement(By.linkText("Best Sellers")).click();
		List<WebElement> bag = driver.findElements(By.xpath
				("//div[a[span[div[text()='American Tourister 32 Ltrs Black Casual Backpack (AMT FIZZ SCH BAG 02 - BLACK)']]]]/div[2]/div/div/a/div/span/span"));
		for (int i = 0; i<bag.size(); i++) {
	    	 
	     }
	     System.out.println("Bag price:"+bag.get(0).getText());
	}

}
