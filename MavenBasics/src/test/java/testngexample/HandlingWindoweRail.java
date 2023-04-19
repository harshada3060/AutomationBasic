package testngexample;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class HandlingWindoweRail extends SeleniumUtility {
	@Test
	public void eRail() {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://erail.in");
		String homePageWin = driver.getWindowHandle();
		driver.findElement(By.xpath("//div/a[text()='eCatering']")).click();
		Set<String> allWin = driver.getWindowHandles();
		allWin.remove(homePageWin);
		Iterator<String> itr = allWin.iterator();
		String childWin = itr.next();
		driver.switchTo().window(childWin);
		driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']")).click();
		WebElement trainNumber = driver.findElement(By.xpath("//input[@class='form-input pl-12  text-sm']"));
		trainNumber.sendKeys("12627");
		trainNumber.click();
		driver.findElement(By.xpath("//div[@class='top-109px absolute h-full overflow-y-auto']//button")).click();
//	    WebElement date=	driver.findElement(By.xpath("//input[@placeholder='Boarding Date']"));//for date
//	    date.sendKeys(Keys.PAGE_DOWN);
		WebElement date = driver
				.findElement(By.xpath("//input[@class='form-input custom-date-picker h-11.5 pl-12 text-sm']"));
		date.click();
		date.sendKeys(Keys.PAGE_DOWN);
		date.sendKeys(Keys.TAB);
		date.click();
		driver.findElement(By.xpath("//div[2][@class='relative mb-6']/select/option[28]")).click();
		driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
		List<WebElement> restaurantName = driver
				.findElements(By.xpath("//div[@class='flex flex-wrap items-center mb-2 ']/h5"));
		System.out.println("Restarant count:" + restaurantName.size());
		for (int i = 0; i < restaurantName.size(); i++) {
			//WebElement restarantlist = restaurantName.get(i);
			//System.out.println("RestarantList:" + restarantlist.getText());
			System.out.println("RestarantList:" + restaurantName.get(i).getText());
		}
		driver.switchTo().window(homePageWin);
         WebElement from =driver.findElement(By.xpath("//input[@placeholder='From Station']"));
         from.clear();
         from.sendKeys("Pune Jn");
         driver.findElement(By.xpath("//div[@class='selected']")).click();
         WebElement To = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
         To.clear();
         To.sendKeys("Bangalore Cant");
         driver.findElement(By.xpath("//div[@title='Bangalore Cant']")).click();
         driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")).click();
         WebElement Date = driver.findElement(By.xpath("//a[@class='icon-right-big']"));
 		for (int i = 0; i < 3; i++) {
 			Date.sendKeys(Keys.chord(Keys.TAB, Keys.ENTER));
 			Date.click();
 		}
 		WebElement seats = driver.findElement(By.xpath("//select[@title='Select seat reservation quota']"));
 		for(int i=0; i< 2; i++) {
 			seats.sendKeys(Keys.chord(Keys.ENTER,Keys.PAGE_DOWN));
 			seats.click();
 		}
        //for train type
 		//driver.findElement(By.xpath("//table[@id='tableTopMenu']//select/option[text()='Train Type']")).click();
 		// for class
 		//driver.findElement(By.xpath("//table[@id='tableTopMenu']//select[@id='selectClassFilter']/option[2]")).click();
 		//driver.findElement(By.xpath("//input[@value='Get Trains']")).click();
// 		List<WebElement> trainName = driver.findElements(By.xpath(
// 				"//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//following::tr[@onmouseout='HideCalendar()']/td[2]"));
// 		for (int i = 0; i < trainName.size(); i++) {
// 			System.out.println("the train name available on that day is:" + trainName.get(i).getText());

 	}
 
	}

