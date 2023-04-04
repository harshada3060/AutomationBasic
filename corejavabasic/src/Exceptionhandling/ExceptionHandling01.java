package Exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling01 {
     public static void main(String[] args) {
		System.out.println("program starts here");
		//1.abnormal statement
		int i,j,k;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first num1:");
		i = scn.nextInt();
		System.out.println("Enter second num2:");
		j = scn.nextInt();
		k=i/j;//ArithmeticException
		System.out.println("res:"+k);
		System.out.println("program ends");

	}

}
/**
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> catch() donesn't that type of declaration dn jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/