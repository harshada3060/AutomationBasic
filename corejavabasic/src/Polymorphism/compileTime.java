package Polymorphism;

public class compileTime {
	static void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of Two number:" + c);
	}

	static void sum(int a, int b, int e) {
		int c = a + b + e;
		System.out.println("Addition of Three number:" + c);
	}

	public static void main(String[] args) {
		compileTime.sum(45, 80, 22);
		compileTime.sum(4, 4);
	}

}
/**
 * compileTime.sum(45, 80, 22); When a method gets to know its implementation at
 * the time of compilation is known as compile time poly this can be achieved by
 * using static method overloading
 */