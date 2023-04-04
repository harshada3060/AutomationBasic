package predifinedClasses.ScannerClass;

import java.util.Scanner;

public class ScannerClassExample1 {
   public static void main(String[] args) {
		String s = "Hello, This is BasicJava.";
		//int a = 47;
// Create scanner Object and pass string in it
		/**
	 * As Scanner class inherits Iterator interface, which as following methods
	 * 1. hasNext()---> check weather it has data or not and return true if it has
	 * 2. next()------> it returns the data present in Scanner object 
	 * 3. remove()----> to remove data
	 */
		Scanner scan = new Scanner(s);
		// Check if the scanner has a token
		//checks if scanner has another token in its input 
       System.out.println("Boolen Result :" +scan.hasNext());
       //print the string
      System.out.println("String : " + scan.nextLine());
      //Return a line of text that is read from the scanner object
       scan.close();
       //close()--it close the scan object method
      System.out.println("------Enter your details-------------");
       Scanner in = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String name = in.next();
      System.out.println("Name :" +name);
      System.out.println("Enter your Age: ");
      int i = in.nextInt();
      System.out.println("Age: "+i);
      System.out.println("Enter your salary: ");
      double d = in.nextDouble();
      System.out.println("salary: "+d);
      in.close();
      }

}
