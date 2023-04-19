package day8.cssValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActitimeErrorMsgPositionValidation {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://demo.actitime.com/");
		SeleniumUtility.clickOnElement(driver.findElement(By.id("loginButton")));
		//explicit wait
		SeleniumUtility.waitUntilTextMatched(By.cssSelector(".errormsg"),"Username or Password is invalid. Please try again.");
		//identify error msg
		WebElement errorMsg = driver.findElement(By.cssSelector(".errormsg"));
		//identify userInput field
		WebElement usernameInputField = driver.findElement(By.id("username"));
		//for error msg position validation ,get error msg and username field x&y
		//cords
		Point errorPosition = errorMsg.getLocation();
		int error_X_Cord = errorPosition.getX();
		int error_Y_Cord = errorPosition.getY();
		System.out.println("Error msg X cords:---->"+error_X_Cord);
		System.out.println("Error msg Y cords:---->"+error_Y_Cord);
		
		Point usernamePosition = usernameInputField.getLocation();
		int username_X_Cord = usernamePosition.getX();
		int username_Y_Cord = usernamePosition.getY();
		System.out.println("username msg X cords:---->"+username_X_Cord);
		System.out.println("username msg Y cords:---->"+username_Y_Cord);
		
		System.out.println
		("Is error msg getting display above username input field: "+(error_Y_Cord<username_Y_Cord));
	}

}
