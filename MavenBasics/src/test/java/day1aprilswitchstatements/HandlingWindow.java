package day1aprilswitchstatements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingWindow {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://etrain.info/in");
		String homepageWinId = driver.getWindowHandle();
		System.out.println("Home page Window Id:" + homepageWinId);
		driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[4]")).click();
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println("All windows Id:" + allWinId);
		allWinId.remove(homepageWinId);
		System.out.println("After Removing HomepageWindowId:" + allWinId);

		// get child window id using iterator
		Iterator<String> itr = allWinId.iterator();
		String childWinId = itr.next();
		driver.switchTo().window(childWinId);
		// or
		// switch control to child window
		// driver.switchTo().window(allWinIds.iterator().next());
		// now you are allow to identify any element from child window
		System.out.println("Linkedin Page Title :" + driver.getTitle());
		System.out.println("Linkedin Page Url:" + driver.getCurrentUrl());

		// close current instance of browser
		// driver.close();
		// driver.quit();//comment below code
		// switch back to home page window in order to perform any required operation on
		// that
		driver.switchTo().window(homepageWinId);
		// now you are allow to identify any element from home window
		System.out.println("etrain page title: " + driver.getTitle());
		System.out.println("etrain page ulr: " + driver.getCurrentUrl());
		// close current instance of browser
		// driver.close();
		// close all the driver instances opened by webdriver
		driver.quit();
	}

}
