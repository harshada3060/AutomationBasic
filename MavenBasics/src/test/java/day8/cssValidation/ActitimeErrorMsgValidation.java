package day8.cssValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class ActitimeErrorMsgValidation {

	public static void main(String[] args) {
	WebDriver driver =	SeleniumUtility.setUp("firefox","https://demo.actitime.com/");
   //click on login button
	
	SeleniumUtility.clickOnElement(driver.findElement(By.id("loginButton")));
	//Explicit wait
	//WebDriverWait wait = new WebDriverWait (driver,30);
	SeleniumUtility.waitUntilTextMatched(By.cssSelector(".errormsg"),"Username or Password is invalid. Please try again.");
	//identify error msg
	WebElement errorMsg = driver.findElement(By.cssSelector(".errormsg"));
	/**
	 * validation-
	 * error msg color:red
	 * font size:13px
	 * 
	 */
	String errorColorInRGBA = errorMsg.getCssValue("color");
	String errorFontSize = errorMsg.getCssValue("font-size");
	String errorLineheight= errorMsg.getCssValue("line-height");
	System.out.println("Error Msg Color code:"+errorColorInRGBA);
	System.out.println("Error Msg Font size:"+errorFontSize);
	System.out.println("Error Msg Line Height:"+errorLineheight);
	}

}
