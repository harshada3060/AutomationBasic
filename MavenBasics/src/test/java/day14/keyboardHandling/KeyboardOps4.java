package day14.keyboardHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class KeyboardOps4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtility.setUp("chrome","https://www.flipkart.com/");
		// using Escape of keyboard to avoid login popup		
       driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
       Thread.sleep(1500);
       driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
       
       /**
		 * possible ways to refresh the browser:
		 * 1. driver.navigate().refresh();
		 * 2. sendKeys(Keys.F5)
		 * 3. by hitting same URL again
		 * 4. ctrl+R
		 */
	}

}
