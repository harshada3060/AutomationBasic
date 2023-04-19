package day8.cssValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class SauceDemoValidation {
	static WebDriver driver;

	public static void main(String[] args) {
		SeleniumUtility.setUp("chrome", "https://www.saucedemo.com/");
		WebElement userNameText =SeleniumUtility.driver.findElement(By.cssSelector("#root>div>:last-child>:last-child>div>div"));
		String userNAmelabel = userNameText.getText();
		System.out.println(userNAmelabel);
		String user[]=userNAmelabel.split("\n");
		SeleniumUtility.driver.findElement(By.id("user-name")).sendKeys(user[1]);
		
		// for password
		WebElement passwordText = SeleniumUtility.driver.findElement(By.cssSelector("#root>div:last-child>:last-child>div>*:last-child>div[class='login_password']"));
		String passwordLabel = passwordText.getText();
		System.out.println(passwordLabel);
		String password[]=passwordLabel.split("\n");
		SeleniumUtility.driver.findElement(By.name("password")).sendKeys(password[1]);
		
		//for color backgrnd
		WebElement color = SeleniumUtility.driver.findElement(By.cssSelector("#login-button"));
       String LoginBagroundClr = color.getCssValue("background-color");
       System.out.println("print backgrnd clr in RGB formate:"+LoginBagroundClr);
      
      //for clr
      String LoginTextClr = color.getCssValue("color");
      System.out.println("print Loging Text color:"+LoginTextClr);
		
      SeleniumUtility.driver.findElement(By.id("login-button")).click();

	}

}
