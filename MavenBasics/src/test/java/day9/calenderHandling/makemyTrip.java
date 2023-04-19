package day9.calenderHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class makemyTrip {

	public static void main(String[] args) {
//String chromeExePath = System.getProperty("user.dir")+".\\executables\\geckodriver.exe";
System.setProperty("webdriver.chrome.driver",".\\executables111\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.makemytrip.com/");
//to handle popup
try {
	//driver.findElement(By.cssSelector("li[data-cy='account']")).click();
	driver.switchTo().frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame")));
	driver.findElement(By.cssSelector(".wewidgeticon.we_close")).click();
	driver.switchTo().defaultContent();

}catch(NoSuchElementException e) {
	System.out.println(e);
}
//identify departure date and click on it
driver.findElement(By.cssSelector("label[for='departure']")).click();
driver.findElement(By.cssSelector("div.DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>*:nth-child(2)>*:nth-child(3)>div>p")).click();
	}
}
