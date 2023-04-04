package predifinedClasses.ScannerClass;

import java.util.Scanner;
 
public class ScannerClassExample2 {
	public static void main(String[] args) {
		int[] empid = new int[5];
		
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < empid.length; i++) {
			System.out.println("Insert your array element in index: " + i);
			empid[i] = in.nextInt();
		}
		System.out.println("**********************1");
		int i = 0;
		for (int num : empid) {
			System.out.println("Index" + i + ": " + num);
			i++;
		}
	}

}
