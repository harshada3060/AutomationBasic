package Exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling2 {
     public static void main(String[] args) {
		System.out.println("program starts from here..");
		//1.abnormal statement
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int size = scn.nextInt();
		int[] empId = new int [size];//here array size means length
	try {
		System.out.println("******You are inside try block...**********");
		System.out.println(empId[3]);// ArrayIndexOutOfBoundsException
		System.out.println("*******Try block ends here...**********");
	}
  catch(Throwable e) {
	System.out.println("**********catch block start here****");
	System.out.println("Exception object:"+e);
	System.out.println("Exception details by printStackTrace:");
	e.printStackTrace();
	System.out.println("With getmessage:"+e.getMessage());
	System.out.println("*******catch block ends here ************");
	}
	System.out.println("progam ends...");
}
}
/**
Complete Exception msg:

* if you are printing Exception object reference: 
		java.lang.ArrayIndexOutOfBoundsException: 3

* exceptionRef.getMessage() ---> 3

*if you want actual exception msg:
		exceptionRef.printStackTrace();
		
		java.lang.ArrayIndexOutOfBoundsException: 3
	at day19.exceptionhandling.ExceptionHandling2.main(ExceptionHandling2.java:13)


*/