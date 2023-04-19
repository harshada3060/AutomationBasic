package testngexample;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.testng.annotations.Test;

public class Actitime_InvocationCount {
	
  @Test(enabled = true,invocationCount = 6)
  public void openBrowserAndAppUrl() {
	System.out.println("Open browser and App Url");
  }
}
