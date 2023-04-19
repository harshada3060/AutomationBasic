package day14.keyboardHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class KeyboardOps {

	public static void main(String[] args) {
	WebDriver driver = SeleniumUtility.setUp("chrome","https://demo.actitime.com/login.do");
	/*		
	 * Login in actitime without clicking on login button
	 */
	WebElement userName = driver.findElement(By.id("username"));
	SeleniumUtility.typeInput(userName, "admin");
	
	WebElement password =driver.findElement(By.name("pwd"));
	SeleniumUtility.typeInput(password, "manager");
	
	//press Enter button from keyboard
	password.sendKeys(Keys.ENTER);
	}

}
