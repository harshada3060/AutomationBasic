package day15.mouseHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class MouseOp2 {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.globalsqa.com/demo-site/");
		List<WebElement> mainMenu = driver.findElements(By.cssSelector("#menu>ul>li>a"));
		System.out.println("Main menu option count:" + mainMenu.size());
		Actions act = new Actions(driver);
		act.moveToElement(mainMenu.get(0)).perform();
		act.moveToElement(mainMenu.get(1)).perform();
		act.moveToElement(mainMenu.get(2)).perform();
		act.moveToElement(mainMenu.get(3)).perform();
		for (int i = 0; i < mainMenu.size(); i++) {

			act.moveToElement(mainMenu.get(i)).perform();
		}
		/** Mouse hover using reusable function/method */
		mouseHover(act, mainMenu);
		/** Mouse hover using reusable function/method */
		mouseHoverOverInTheElement(act, mainMenu.get(2));

		/** Mouse hover with cords */
		// act.moveToElement(mainMenu.get(2), 100, 0).perform();
		/** Mouse hover with cords using reusable function */
		mouseHoverWithCords(act, mainMenu.get(1), 100, 0);

		/** Right click on required Element */
		// act.moveToElement(mainMenu.get(1)).contextClick().build().perform();
		rightClick(act, mainMenu.get(1));

	}

	static void mouseHover(Actions act, List<WebElement> mainMenu) {
		for (int i = 0; i < mainMenu.size(); i++) {
			WebElement options = mainMenu.get(i);
			act.moveToElement(mainMenu.get(i)).perform();
		}
	}

	static void mouseHoverOverInTheElement(Actions act, WebElement element) {
		act.moveToElement(element).perform();
	}

	static void rightClick(Actions action, WebElement option) {
		System.out.println("Option name is : " + option.getText());
		action.moveToElement(option).contextClick().build().perform();
		// action.contextClick(option).build().perform();
	}

	static void mouseHoverWithCords(Actions act, WebElement option, int x, int y) {
		System.out.println("Option name is : " + option.getText());
		act.moveToElement(option, x, y).perform();
	}
}