package TestCasesAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class ActitimeAddTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.cssSelector(".addNewButton")).click();
		driver.findElement(By.cssSelector(".item.createNewTasks")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement dropdown = driver.findElement(By.cssSelector(
				"div[class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>div>:nth-child(3)"));
		dropdown.click();
		List<WebElement> suggestionList = driver.findElements(By.cssSelector(
				"div[class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>:nth-child(2)>div>div>div>div"));
		System.out.println("Total suggesion found:" + suggestionList.size());
		suggestionList.get(4).click();
		
		WebElement dropdown1 = driver.findElement(By.cssSelector(
				"div[class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>div>:nth-child(3)"));
		dropdown1.click();
		List<WebElement> projectList = driver
				.findElements(By.cssSelector(".projectSelector>div>:nth-child(2)>div>div>div>div"));
		if (projectList.size() > 3) {
			projectList.get(3).click();

			List<WebElement> taskList = driver.findElements(By.cssSelector(
					".tablePlaceholder>div>div>table>:nth-child(3)>tr>td>input[placeholder='Enter task name']"));
			taskList.get(0).click();
			taskList.get(0).sendKeys("Robo");

			driver.findElement(By.xpath("//td[@class='billingTypeCell']//div[@class='typeOfWorkButton editable']"))
					.click();
			driver.findElement(By.cssSelector("div[class='components_button withPlusIcon']")).click();

			// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']/td/div")).click();

			Thread.sleep(1000);
			// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("div[class='delete button']")).click();
			driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();

		}
	}

}
