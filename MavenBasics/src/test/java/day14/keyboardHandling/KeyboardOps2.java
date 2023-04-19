package day14.keyboardHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class KeyboardOps2 {

public static void main(String[] args) {
  WebDriver driver = SeleniumUtility.setUp("chrome","http://demo.automationtesting.in/Register.html");

  WebElement firstname = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
//type first name as admin and use ctrl+a
   firstname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
   //in first name field use ctrl+c
   firstname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
              //or
 // firstname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a",Keys.chord(Keys.CONTROL,"c")));
   
  driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
