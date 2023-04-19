package day8.cssValidation;



	import org.openqa.selenium.By;
	import org.openqa.selenium.By.ByCssSelector;
	import org.openqa.selenium.WebElement;

	import utilities.SeleniumUtility;

	public class Assignment {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SeleniumUtility.setUp("firefox", "https://www.saucedemo.com/");
			WebElement username = SeleniumUtility.driver
					.findElement(By.cssSelector("#root>div>:last-child>:last-child>div>div"));
			String AllUsernames = username.getText();
			String UserNameSplit = AllUsernames.substring(24, 38);
			System.out.println(UserNameSplit);
			SeleniumUtility.driver.findElement(By.id("user-name")).sendKeys(UserNameSplit);
			WebElement password = SeleniumUtility.driver
					.findElement(By.cssSelector("#root>div>:last-child>:last-child>div>*:last-child"));
			String pass = password.getText();
			String subStr = pass.substring(24, 36);
			System.out.println(subStr);
			SeleniumUtility.driver.findElement(By.id("password")).sendKeys(subStr);
			SeleniumUtility.driver.findElement(By.id("login-button")).click();

		}
	}


