package day7.webdriverwithPropertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.SeleniumUtility;

public class ActitimeLoginLogout2 {
public static void main(String[] args) throws IOException {

	    //load required property file
		SeleniumUtility.loadPropertyFile(".\\src\\test\\resources\\testData\\AppData.properties");
		
		//get data from property file
		String browser = SeleniumUtility.getDataFromPropertyFile("browserName");
		String url =SeleniumUtility.getDataFromPropertyFile("appUrl");
		//String exp_LoginPageTitle =SeleniumUtility. prop.getProperty("expectedLoginPage");
		String userName =SeleniumUtility.getDataFromPropertyFile("username");
		String password =SeleniumUtility.getDataFromPropertyFile("password");
		String exp_homePageTitle = SeleniumUtility.getDataFromPropertyFile("expectedTitle");
		
		SeleniumUtility.setUp(browser,url);
		SeleniumUtility.driver.findElement(By.id("username")).sendKeys(SeleniumUtility.getDataFromPropertyFile("username"));
		SeleniumUtility.driver.findElement(By.name("pwd")).sendKeys(SeleniumUtility.getDataFromPropertyFile("password"));
		SeleniumUtility.driver.findElement(By.id("loginButton")).click();
		
		//SeleniumUtility.wait.until(ExpectedConditions.titleIs(exp_homePageTitle));
		SeleniumUtility.waitUntilPageTitleMatched(exp_homePageTitle);
		String act_HomePageTitle = SeleniumUtility.driver.getTitle();
		System.out.println("Home Page Validation status:"+ act_HomePageTitle.equals(exp_homePageTitle));
		
		SeleniumUtility.driver.close();
	}

}

