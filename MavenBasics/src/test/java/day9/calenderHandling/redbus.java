package day9.calenderHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class redbus {
public static void main(String[] args) {
	SeleniumUtility.setUp("chrome", "https://www.redbus.in/");
	SeleniumUtility.driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
	SeleniumUtility.driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody//tr[7]//td[text()='30']")).click();
	SeleniumUtility.driver.findElement(By.xpath("//div[@class='fl search-box clearfix']/div//input[@type='text' and@id='src']")).sendKeys("pune");
	WebElement Allsuggetion=SeleniumUtility.driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[2]"));
	Allsuggetion.click();
	SeleniumUtility.driver.findElement(By.xpath("//div[@class='fl search-box']/div//input[@type='text']"))
	.sendKeys("Nagpur");
WebElement all = SeleniumUtility.driver.findElement(By.xpath(
	"//ul[@class='autoFill homeSearch']//li[@data-id='624']//i[@class='icon solr-icon icon-ic-city']"));
all.click();
SeleniumUtility.driver.findElement(By.xpath("//button[@id='search_btn']")).click();
SeleniumUtility.driver.findElement(By.xpath("//ul[@class=\"dept-time dt-time-filter\"]//li[3]/label[@class='custom-checkbox']")).click();
SeleniumUtility.driver.findElement(By.xpath("//div[@class='fr']//i[@class='icon-close coach-close']")).click();
SeleniumUtility.driver.findElement(By.xpath("//ul[@class='list-chkbox']//li[3]//label[@for=\"bt_AC\"]")).click();

List<WebElement>TravelsName=SeleniumUtility.driver.findElements(By.cssSelector(".bus-items>div .travels"));
List<WebElement>busPrice=SeleniumUtility.driver.findElements(By.xpath("//ul[@class='bus-items']//div[@class='seat-fare ']//span[@class!='strike']"));



	System.out.println("travels size :"+TravelsName.size());
	for(int i=0;i<TravelsName.size();i++) {
		WebElement AlltravelsName=TravelsName.get(i);
		WebElement price=busPrice.get(i);
		System.out.println("travels name and price :"+i+ " :"+AlltravelsName.getText()+ " :"+price.getText());
	}
}
}
