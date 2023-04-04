package method_overloading;

public class methodoverloading5 {
	public static void main(String args[]) {
		methodoverloading5 obj1 = new methodoverloading5();
		obj1.myMethod(10, 10);
		obj1.myMethod(20, 12);
	}

	public int myMethod1(int num1, int num2) {
		System.out.println("First myMethod of class Demo");
		return num1 + num2;
	}

	public int myMethod(int var1, int var2) {
		System.out.println("Second myMethod of class Demo");
		return var1 - var2;
	}
}
