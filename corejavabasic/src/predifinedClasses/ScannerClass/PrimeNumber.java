package predifinedClasses.ScannerClass;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		System.out.println("Enter number to check prime number:....");
		num = scn.nextInt();
		System.out.println("Even number " + num + "is ,prime or not?" + checkPrimeNumber(num));
		checkPrimeNumberTillPassedNumber(num);
	}

	static boolean checkPrimeNumber(int num) {
      int counter = 0;
	    if (num > 1) {
		for (int i = 1; i <= num; i++) {
		   if (num % i == 0) {
			++counter;
				}
			}
	if (counter == 2) {
		System.out.println("prime number:" + num);
			return true;
	} else {
				System.out.println("Number is not prime :" + num);
				return false;
			}
	} else {
			System.out.println("Given number is either 0 or 1 or negative");
			return false;
		}
	}

	static void checkPrimeNumberTillPassedNumber(int num) {
	if (!(num == 0 || num == 1)) {
		for (int i = 2; i <= num; i++) {
		   int counter = 0;
				for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
				++counter;
			}
		}
	
		if (counter == 2) {
		     System.out.println("Prime Number: " + i);
				}
		}
		 
	} else {
			 
      System.out.println("Either the given number is 0/1, so won't it consider for prime number");
		}
	}

}
/**
 * set break point in the required location
 * next line : F6 
 * inside function or method: F5 
 * value of variable: ctrl+shft+i
 * continue : F8
 */