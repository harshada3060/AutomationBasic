package testngexample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class HandlingWindowRailInfo extends SeleniumUtility {
	@Test
	public void RailInfo() {
		WebDriver driver = setUp("chrome", "https://etrain.info/in");
		System.out.println("Home page Title:" + driver.getTitle());
		System.out.println("Home page Url:" + driver.getCurrentUrl());

		String homeWinId = driver.getWindowHandle();
		System.out.println("Home Page Id:" + homeWinId);

		clickOnElement(driver.findElement(By.cssSelector(".icon-twitter")));
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println("All Window Id:" + allWinId);
		allWinId.remove(homeWinId);

		Iterator<String> itr = allWinId.iterator();
		String childWinId = itr.next();

		driver.switchTo().window(childWinId);
		System.out.println("child WinId title:" + driver.getTitle());
		System.out.println("child WinId Url:" + driver.getCurrentUrl());

		driver.switchTo().window(homeWinId);
	}
}
