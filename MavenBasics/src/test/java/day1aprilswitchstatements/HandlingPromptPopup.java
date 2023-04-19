package day1aprilswitchstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingPromptPopup {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtility.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//get text from confirmation popup
		String alertText=driver.switchTo().alert().getText();
		System.out.println("Alert pop msg: "+alertText);
		//type Pune in popup
		driver.switchTo().alert().sendKeys("Jamner");
		
		//click on OK button of Alert
		driver.switchTo().alert().accept();
		
		//click on Cancel button
		//driver.switchTo().alert().dismiss();

	}

}
