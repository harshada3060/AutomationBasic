package day14.keyboardHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class KeyboardOps1 {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.flipkart.com/");
		//press ESCAPE button to remove Popup
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);

	}

}
