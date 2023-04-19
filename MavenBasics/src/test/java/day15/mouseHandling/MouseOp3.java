package day15.mouseHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class MouseOp3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleniumUtility.setUp("chrome", "https://www.globalsqa.com/demo-site/draganddrop/");
		// frame handling
				WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
				driver.switchTo().frame(frame);
				Actions act = new Actions(driver);
				//first identify source and target elements for drag and drop
				List<WebElement> sourceElements = driver.findElements(By.cssSelector("ul#gallery>li"));
				WebElement target = driver.findElement(By.id("trash"));
				//perform dragAndDrop operation
				act.dragAndDrop(sourceElements.get(0), target).build().perform();
				act.dragAndDrop(sourceElements.get(1), target).build().perform();
				act.dragAndDrop(sourceElements.get(2), target).build().perform();
				act.dragAndDrop(sourceElements.get(3), target).build().perform();
				
				for(int i=0;i<sourceElements.size();i++) {
					performDranAndDrop(act, sourceElements.get(i), target);
					Thread.sleep(1000);
				}
	}
	static void performDranAndDrop(Actions act,WebElement src,WebElement target) {
		act.dragAndDrop(src, target).build().perform();
	}
}

