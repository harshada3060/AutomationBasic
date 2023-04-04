package Typecasting;

public class PrimitiveCasting3 {
	public static void main(String[] args) {
		double myDouble = 9.78d;//implicit
		int myInt = (int) myDouble;//explicit narrowing

		System.out.println(myDouble);
		System.out.println(myInt);
	}
}
