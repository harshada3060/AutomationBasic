package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties properties;
	public static Actions act;
	protected FileInputStream fis;
	protected static String filePath;
	static{
		filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\testAppData.properties";
	}

	public static WebDriver setUp(String browserName, String appUrl) {
//		properties = new Properties();
//		try {
//			fis = new FileInputStream(filePath);
//			properties.load(fis);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maximize browser window
		driver.manage().window().maximize();
		// Define WebDriverWait
		wait = new WebDriverWait(driver, 20);
		driver.get(appUrl);
		act = new Actions(driver);
		return driver;
	}

	public static void typeInput(WebElement element, String input) {
		waitUntilElementIsVisible(element);
		element.clear();
		element.sendKeys(input);
	}

	public static void clickOnElement(WebElement element) {
		waitUntilElementClickable(element);
		element.click();
	}

	public static void waitUntilTextMatched(By element, String text) {
		wait.until(ExpectedConditions.textToBe(element, text));
	}

	public static void waitUntilElementClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitUntilPageTitleMatched(String title) {
		wait.until(ExpectedConditions.titleIs(title));
	}

	public static void waitUntilElementIsVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void loadPropertyFile(String filePath) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getDataFromPropertyFile(String key) {
		return properties.getProperty(key);
	}

	public String getCurrentPageTitle(String title) {
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}

	public String getAttributeForElement(WebElement element, String attributeName) {
		waitUntilElementIsVisible(element);
		return element.getAttribute(attributeName);
	}

	public String getTextForElement(WebElement element) {
		waitUntilElementIsVisible(element);
		return element.getText();

	}

	public Select getDropdown(WebElement element) {
		waitUntilElementIsVisible(element);
		return new Select(element);
	}

	public String getTextFromDropdown(Select select) {
		return select.getFirstSelectedOption().getText();
	}

	public void mouseHoverOverInTheElement(Actions act, WebElement element) {
		act.moveToElement(element).perform();
	}

	public void rightClick(Actions action, WebElement option) {

		action.moveToElement(option).contextClick().build().perform();

	}

	public void mouseHoverWithCords(Actions act, WebElement option, int x, int y) {

		act.moveToElement(option, x, y).perform();
	}

	public void performDragAndDrop(Actions act, WebElement src, WebElement target) {
		waitUntilElementIsVisible(src);
		waitUntilElementIsVisible(target);
		act.dragAndDrop(src, target).build().perform();
	}

	public void copyTextFromElement(WebElement element) {
		act.doubleClick(element).sendKeys(Keys.chord(Keys.CONTROL, "c"));

	}

	public void pasteCopiedTextFromElement(WebElement element) {
		act.moveToElement(element).sendKeys(Keys.chord(Keys.CONTROL, "v"));

	}

	public void copyPasteText(WebElement copyFrom, WebElement copyTo) {
		copyTextFromElement(copyFrom);
		pasteCopiedTextFromElement(copyTo);
	}
	public void takeScreenShotOfThePage(String location) {
		// downcast the driver to access TakesScreenshot method
		TakesScreenshot ts = (TakesScreenshot) driver;
		// capture screenshot as output type FILE
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			// save the screenshot taken in destination path
			FileUtils.copyFile(file, new File(location));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getRequiredAttributeValue(WebElement element,String attribute) {
		waitForElementDisplayed(element);
		setSleepTime(2000);
		return element.getAttribute(attribute);
	}

		/**
	 * Method to get the title of current page
	 */
	public String getCurrentTitleOfApplication(String title) {
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	
	/**
	 * Method to get the current url of the application
	 */
	public String getCurrentUrlOfApplication() {
		return driver.getCurrentUrl();
	}

	public boolean isElementExist(WebElement element) {
		waitForElementDisplayed(element);
		return element.isDisplayed();
	}

	public boolean isCheckBoxSelected(WebElement element) {
		waitForElementDisplayed(element);
		return element.isSelected();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	public void handleHtmlDropdownListWithVisibleText(WebElement element, String visibileText) {
		waitForElementDisplayed(element);
		Select select = new Select(element);
		select.selectByVisibleText(visibileText);
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	public void handleHtmlDropdownListWithIndex(WebElement element, int index) {
		waitForElementDisplayed(element);
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected List<WebElement> getHtmlDropdownListSize(WebElement element) {
		waitForElementDisplayed(element);
		Select select = new Select(element);
		return select.getOptions();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected WebElement getFirstSelectedOptionFromHtmlDropdownList(WebElement element) {
		waitForElementDisplayed(element);
		Select select = new Select(element);
		return select.getFirstSelectedOption();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected List<WebElement> getAllSelectedOptionFromMultiSelectDropdownList(WebElement element) {
		waitForElementDisplayed(element);
		Select select = new Select(element);
		return select.getAllSelectedOptions();
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchToIFrameWithWebElement(WebElement element) {
		waitForElementDisplayed(element);
		driver.switchTo().frame(element);
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchToIFrameWithIndex(int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchFromIFrameToMainPage() {

		driver.switchTo().defaultContent();
	}

	/**
	 * This is sleep method from java only use it when uttermost required
	 * 
	 * @param millis time in mili seconds
	 */
	protected void setSleepTime(long millis) {

		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {

		}
	}
	/**
	 * Method to refresh Page
	 */
	protected void refreshPage() {

		driver.navigate().refresh();
	}
	/**
	 * Method to wait for an element till it's not display .
	 * 
	 * @param by
	 */
	public void waitForElementDisplayed(WebElement element) {

		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * Method to wait for an element till it's not clickable.
	 * 
	 * @param by
	 */
	public void waitForElementToBeClickable(WebElement element) {

		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public WebElement getActiveElementFromUI() {
  	  
  	  return driver.switchTo().activeElement();
		
		}
    public void cleanUp() {
  	  
  	  driver.close();
    }
    public String getCurrentTitleOfApplication() {
		
    	return driver.getTitle();
    	}

	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}