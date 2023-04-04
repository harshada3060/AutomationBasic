package propertyFileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StepToReadPropertyFile2 {

	public static void main(String[] args) throws IOException {

	 String currentDir = System.getProperty("user.dir");
	 String propertyFileLocation = currentDir+"\\PropertyFiles\\TestData.properties";
	 
	  String fileLocation="H:\\accelarationjavaworkspace\\corejavabasic\\src\\propertyFiles\\TestData.properties";
	  FileInputStream fis = new FileInputStream(fileLocation);
	  
	  Properties pr = new Properties();
	  
	  pr.load(fis);
	  
	  System.out.println(pr.getProperty("applicationUrl"));
	  System.out.println(pr.getProperty("expectedTitle"));
	  System.out.println(pr.getProperty("principleAmount"));
	  System.out.println(pr.getProperty("roi"));
	  System.out.println(pr.getProperty("username"));
	}

}
