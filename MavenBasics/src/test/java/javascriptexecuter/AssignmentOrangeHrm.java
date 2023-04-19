package javascriptexecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class AssignmentOrangeHrm extends SeleniumUtility{
  @Test
  public void testCase() throws InterruptedException {
	  WebDriver driver = setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  Thread.sleep(1500);
	  js.executeScript("document.getElementsByName('username')[0].value='Admin'");
	  Thread.sleep(1500);
	  js.executeScript("document.getElementsByName('password')[0].value='admin123'");
	  Thread.sleep(1500);
    js.executeScript("document.getElementsByClassName('oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')[0].click();");
   // js.executeScript("document.getElementsByTagName('button').click();");
//	  Thread.sleep(1500);
  }
}
