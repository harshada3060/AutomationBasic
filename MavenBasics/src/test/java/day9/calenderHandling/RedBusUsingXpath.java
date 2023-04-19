package day9.calenderHandling;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.SeleniumUtility;

public class RedBusUsingXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility.setUp("chrome", "https://www.redbus.in/");
		WebElement cityFrom = SeleniumUtility.driver
				.findElement(By.cssSelector("#search>div>:nth-child(1)>:last-child>input"));
		cityFrom.sendKeys("mumbai");
		WebElement all = SeleniumUtility.driver
				.findElement(By.cssSelector("#search_div>:last-child>div>div>:nth-child(2)>ul>*:nth-child(2)"));
		all.click();
		WebElement cityTo = SeleniumUtility.driver.findElement(By.xpath("//input[@id='dest']"));
		cityTo.sendKeys("pune");
		WebElement allSuggestion = SeleniumUtility.driver
				.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[2]"));
		allSuggestion.click();
		SeleniumUtility.driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']"))
				.click();
		WebElement next = SeleniumUtility.driver
				.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody/tr/td[3]"));
		next.click();
		SeleniumUtility.driver.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody/tr[5]/td")).click();
		SeleniumUtility.driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		SeleniumUtility.driver
				.findElement(
						By.xpath("//ul[@class=\"dept-time dt-time-filter\"]//li[3]/label[@class='custom-checkbox']"))
				.click();
		SeleniumUtility.driver.findElement(By.xpath("//ul[@class='list-chkbox']//li[3]//label[@for=\"bt_AC\"]"))
				.click();
		List<WebElement> buses = SeleniumUtility.driver
				.findElements(By.xpath("//div[@scrollthreshold='1']/ul/div/li//div/div/div/div/div"));
		System.out.println("Total Buses List:" + buses.size());
		System.out.println("****************");

		for (int i = 0; i < buses.size(); i++) {

			WebElement bus = buses.get(i);

			System.out.println(bus.getText());
		}
	}
}