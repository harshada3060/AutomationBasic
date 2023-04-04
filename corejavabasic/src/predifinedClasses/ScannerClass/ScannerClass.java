package predifinedClasses.ScannerClass;
import java.util.Scanner;
public class ScannerClass {
	  int addNumber1(char op,int num1,int num2) {
	     if(op== '+') {
	    	 return num1+num2;
	     }else {
	    	 return 0;
	     }
		
		
		}

	public static void main(String[] args) {
//		int age=10;
//		double salary=2566.36;
//		String name="Pune";
		
		// Object creation of Scanner class
		 
		Scanner scnRef =  new Scanner(System.in);
		int age;
		double salary;
		String name;
		boolean valid;
		/* Initialization of variable using Scanner class */
		System.out.println("Enter age Value from Console");
		age= scnRef.nextInt();
		System.out.println("Enter Salary Value From console");
		salary = scnRef.nextDouble();
		System.out.println("Enter name value From console");
		name = scnRef.next();
		System.out.println("Enter true/false from console");
		valid = scnRef.nextBoolean();
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
		System.out.println("name: " + name);
		System.out.println("valid: " + valid);
		
		
		ScannerClass sc = new ScannerClass();
		//System.out.println(sc.addNumber1(op, num1, num2));
		
		int num1,num2;
		System.out.println("Enter num1 : ");
		num1 = scnRef.nextInt();
		System.out.println("Enter num2 : ");
		num2 = scnRef.nextInt();
		char op;
		System.out.println("Enter operator: ");
		op = scnRef.next().charAt(0);
		
		System.out.println("addition of non static method:"+sc.addNumber1(op, num1, num2));

		System.out.println("Addition of Two numbers: "+addNumber(op,num1,num2));
        System.out.println("*********************************************************");
	}
     static int addNumber(char op,int num1,int num2) {
     if(op== '+') {
    	 return num1+num2;
     }else {
    	 return 0;
     }
	
	
	}

}	


