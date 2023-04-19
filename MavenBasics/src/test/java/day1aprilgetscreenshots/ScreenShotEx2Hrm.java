package day1aprilgetscreenshots;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//import utilities.SeleniumUtility;
//
//public class ScreenShotEx2Hrm {
//
//	public static void main(String[] args) throws IOException {
//		WebDriver driver = SeleniumUtility.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		//type cast WebDriver instance into TakesScreenshot interface
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		//get screenshot using getScreenshotAs() of TakesScreenshot interface
//		File file=ts.getScreenshotAs(OutputType.FILE);
//		//store above screenshot into required location
//		FileUtils.copyFile(file,new File(".\\screenshots\\orangehrmlive.jpg"));
//	}
//
//}
