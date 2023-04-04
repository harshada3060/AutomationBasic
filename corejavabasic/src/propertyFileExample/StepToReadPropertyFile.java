package propertyFileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class StepToReadPropertyFile {

	public static void main(String[] args) throws IOException  {
		
		String currentDir = System.getProperty("user.dir");
		
		FileInputStream f1 = new FileInputStream(currentDir+ "\\propertyFiles\\AppData.properties");
		                  //or
		FileInputStream f2 = new FileInputStream("H:\\accelarationjavaworkspace\\corejavabasic\\src\\propertyFiles\\AppData.properties");
		                 //or
		FileInputStream f3 = new FileInputStream(".\\propertyFiles\\AppData.properties");
		Properties prop = new Properties();
		
		prop.load(f2);
		
		System.out.println(prop.getProperty("applicationURL"));
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("emailid"));
		System.out.println(prop.getProperty("phonenumber"));
		
	}

}
/*
 * 1. First find the location where you have stored property file
   2. Create an instance of FileInputStream class and pass the property file location to its constructor.
   3. Create an instance of Properties class
   4. With the help of properties reference variable call load() properties class and pass FileInputStream class reference to this method
	   5. Call getProperty(key) of Properties class to read data from property file
 */
/*Property file location with 

 * absolute path:Total path
 *                 F:\JavaWorkspace\CoreJavaSessions\PropertyFiles\TestData.properties
 * relative path:means the pathe with "." sign
 *                 .\PropertyFiles\TestData.properties
 * Using System class:
 * 			String currentDir=System.getProperty("user.dir");
 * 			String propertyFileLocation =currentDir+"\\PropertyFiles\\TestData.properties";
 */
//String fileLocation="F:\\JavaWorkspace\\CoreJavaSessions\\PropertyFiles\\TestData.properties";
		