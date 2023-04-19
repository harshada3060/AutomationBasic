package day9.calenderHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.SeleniumUtility;

public class redBusExample {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		SeleniumUtility.driver.findElement(By.cssSelector("#src")).sendKeys("Pune");
		WebElement All = SeleniumUtility.driver.findElement(By.cssSelector(".autoFill.homeSearch>li[class='selected']"));
		All.click();
		SeleniumUtility.driver.findElement(By.cssSelector("#dest")).sendKeys("Goa");
		WebElement Alls = SeleniumUtility.driver.findElement(By.cssSelector(".autoFill.homeSearch>li[class='selected']"));
		Alls.click();
		SeleniumUtility.driver.findElement(By.xpath("//tbody/tr[@class='rb-monthHeader']/td[3]")).click();
		SeleniumUtility.driver.findElement(By.xpath("//tr[5]/td[2]")).click();
		SeleniumUtility.driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		SeleniumUtility.driver.findElement(By.xpath("//ul[@class='dept-time dt-time-filter']//following::li[1]//preceding-sibling::label")).click();
		SeleniumUtility.driver.findElement(By.xpath("//div[@class='button']//i")).click();
		//SeleniumUtility.driver.findElement(By.xpath("//ul[@class='list-chkbox']/li[3]/label")).click();
		//SeleniumUtility.driver.findElement(By.xpath("//div[contains(text(),'BUS TYPES')]//following::ul/li[3]/label")).click();
	
		List<WebElement> buses= SeleniumUtility.driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		System.out.println("Total Buses List:" + buses.size());
	     for (int i = 0; i < buses.size(); i++) {
		 WebElement buslist = buses.get(i);
			System.out.println("BusesList:"+buslist.getText());
	     }
			List<WebElement> busesp= SeleniumUtility.driver.findElements(By.xpath("//div[@class='seat-fare ']//div[2]/span"));
			System.out.println("Total Buses List:" + busesp.size());
		     for (int i = 0; i < buses.size(); i++) {
			 WebElement price = busesp.get(i);
				System.out.println("Buses price:"+price.getText());
			
	}

}
}