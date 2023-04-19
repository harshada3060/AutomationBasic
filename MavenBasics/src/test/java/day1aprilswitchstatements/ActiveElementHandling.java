package day1aprilswitchstatements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActiveElementHandling {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://demo.actitime.com/login.do");
		//get focused element from UI
		WebElement focusedElement = driver.switchTo().activeElement();
       String actualAttributeName = focusedElement.getAttribute("placeholder");
       System.out.println("Is focus username input field:"+ actualAttributeName.equals("Username"));
       focusedElement.sendKeys("admin",Keys.TAB);
     //move to Active Element, type password as manager and press ENTER button
       driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	}

}
/*
check default mouse pointer is pointing to username input field or not
login into actitime with identifying any element
*/