package day1aprilgetscreenshots;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//import org.omg.IOP.TAG_CODE_SETS;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//import utilities.SeleniumUtility;
//
//public class ScreenShotExamples {
//
//	public static void main(String[] args) throws IOException {
//		WebDriver driver = SeleniumUtility.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
//		//type cast WebDriver instance into TakesScreenshot interface
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		//get screenshot using getScreenshotAs() of TakesScreenshot interface
//		File file=ts.getScreenshotAs(OutputType.FILE);
//		//store above screenshot into required location
//		FileUtils.copyFile(file,new File(".\\screenshots\\vtiger1.jpg"));
//
//	}
//
//}
