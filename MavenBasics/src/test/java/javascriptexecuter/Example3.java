package javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example3 extends SeleniumUtility {
	@Test
	public void testCase() {
		WebDriver driver = setUp("chrome", "https://www.flipkart.com/");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
		setSleepTime(2000);
		js.executeScript("window.scrollBy(0,-2500)");
		// Horizontal scrolling
	//js.executeScript("window.scrollBy(500,0)");
	}

	private void setSleepTime(int i) {
		// TODO Auto-generated method stub

	}

}
