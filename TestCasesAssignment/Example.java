package TestCasesAssignment;


	import java.util.List;

	import javax.management.openmbean.OpenMBeanAttributeInfo;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

	

	public class Example {

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = SeleniumUtility.setUp("chrome", "http://demo.actitime.com/login.do");

			driver.findElement(By.id("username")).sendKeys("admin");

			driver.findElement(By.name("pwd")).sendKeys("manager");

			driver.findElement(By.id("loginButton")).click();

			driver.findElement(By.xpath("//a[@class='content tasks']")).click();

			driver.findElement(By.xpath("//div[@class='addNewButton']")).click();

			driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();

			WebDriverWait wait = new WebDriverWait(driver, 30);

			driver.findElement(By.cssSelector(
					"div[class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>div>:nth-child(3)"))
					.click();

			List<WebElement> CustomerList = driver
					.findElements(By.cssSelector(".customerSelector >div>:nth-child(2)>div>div>div>div"));

			// System.out.println("List are : "+CustomerList.size());

			CustomerList.get(3).click();

			driver.findElement(By.cssSelector(
					"div[class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>div>:nth-child(3)"))
					.click();

			List<WebElement> ProjectList = driver
					.findElements(By.cssSelector(".projectSelector >div>:nth-child(2)>div>div>div>div"));
			if (ProjectList.size() > 3) {

				ProjectList.get(3).click();

			}

			List<WebElement> TasktList = driver.findElements(By.cssSelector(
					".tablePlaceholder>div>div>table>:nth-child(3)>tr>td>input[placeholder='Enter task name']"));

			TasktList.get(0).click();

			TasktList.get(0).sendKeys("rss");

			driver.findElement(By.xpath("//td[@class='billingTypeCell']//div[@class='typeOfWorkButton editable']")).click();

			driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']/td/div")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//div[@class='delete button']")).click();

			driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		}

	}
	

