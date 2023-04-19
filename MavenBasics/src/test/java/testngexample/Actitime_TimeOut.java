package testngexample;

import org.testng.annotations.Test;

public class Actitime_TimeOut {
  @Test(enabled=true,timeOut=200)
  public void openBrowser() throws InterruptedException {
	  Thread.sleep(180);
	  System.out.println("Open browser and App url");
	  
  }
}
