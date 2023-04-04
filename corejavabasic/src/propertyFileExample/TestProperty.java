package propertyFileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperty {

	public static void main(String[] args) throws IOException {
		String currentDir = System.getProperty("user.dir");
		// f = new FileInputStream(currentDir+"\\propertyFiles\\AppData.properties");
		FileInputStream f = new FileInputStream(
				"H:\\accelarationjavaworkspace\\corejavabasic\\src\\propertyFiles\\TestData.properties");

		Properties p = new Properties();

		p.load(f);

		System.out.println(p.getProperty("applicationUrl"));
		System.out.println("**************************");
		String pAmount = p.getProperty("principleAmount");
		System.out.println(pAmount);
		System.out.println("***********************");
		int amount = Integer.parseInt(pAmount);
		int res = amount / 10;
		int roi = Integer.parseInt(p.getProperty("roi"));
		System.out.println("Result: " + res);
		
		System.out.println("ROI: " + roi);
		
		p.setProperty("Test1", "Python");
		p.setProperty("Test2", "Playwright");
		p.setProperty("key1", "manual");
		p.setProperty("key2", "Automation");
		
		FileOutputStream fos = new FileOutputStream(
				"H:\\accelarationjavaworkspace\\corejavabasic\\src\\propertyFiles\\TestData.properties");
		// saving the file into required location using store()
		p.store(fos, "Added two new keys again");
		// close the connection
		fos.close();
		System.out.println("Property file updated successfully....");
	}

}
