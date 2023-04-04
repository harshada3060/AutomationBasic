package method_nonstatic;

public class Non_Static_example2 {

	public static void main(String[] args) {
		// TODO create a method to add two number
		Non_Static_example2 n1 = new Non_Static_example2();
		n1.addTwoNumber(10, 5);
		n1.addTwoNumber(5,19);
		
		// TODO create a method to add two number
		n1.multiplyTwoNumbers(2, 6);// method will be executed but we don't be able to print it's return value
		System.out.println(n1.multiplyTwoNumbers(2, 6));// method will be executed and we will also able to print it's
														// value in console

	}

	void addTwoNumber(int num1, int num2) {
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
		int res = (num1 + num2);
		System.out.println("addition of two numbers:" + res);
	}

	int multiplyTwoNumbers(int a, int b) {
		System.out.println("number a is:" + a);
		System.out.println(("number b is :" + b));
		int res = (a * b);
		System.out.println("multiplication of two numbers:" + res);
		int finalresult = res + 200;
		return finalresult;
	}
}
