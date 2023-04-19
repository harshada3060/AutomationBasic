package day14.xpathExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class FlipcartEx {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome","https://www.flipkart.com/");
		// using Escape of keyboard to avoid login popup		
       driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
       driver.findElement(By.linkText("Mobiles")).click();
       driver.findElement(By.xpath("//div[@class='_331-kn']//span[@class='_2I9KP_']")).click();
       driver.findElement(By.xpath("//a[text()='Samsung']")).click();
       //driver.findElement(By.xpath("//div[div[a[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']]]/div[3]/div/div"));
       List<WebElement> mobile=driver.findElements(By.xpath("//div[div[a[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']]]/div[3]/div/div"));
     //  System.out.println("Total mobile List:" + mobile.size());
	     for (int i = 0; i<mobile.size(); i++) {
	    	 
	     }
	     System.out.println("mobile price:"+mobile.get(0).getText());
}
}