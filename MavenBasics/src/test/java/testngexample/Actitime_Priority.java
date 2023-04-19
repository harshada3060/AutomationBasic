package testngexample;

import org.apache.commons.io.serialization.ValidatingObjectInputStream;
import org.testng.annotations.Test;

public class Actitime_Priority {
  @Test(priority=1,description="Open browser and enter URL")
  public void openBrowserAndAppUrl() {
	  System.out.println("Open Browser and App Url");
  }
  @Test(priority=2)
  public void login() {
	  System.out.println("Enter username password and click on login button");
  }
  @Test(priority=3)
  public void createTask() {
	  System.out.println("Create new task");
  }
  @Test(priority=4)
  public void logOut() {
	  System.out.println("log out and close");
  }
}
