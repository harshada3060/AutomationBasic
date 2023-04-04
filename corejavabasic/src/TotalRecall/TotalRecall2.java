package TotalRecall;

class Operation {
	public void reverseNum(int num) {
		int rev = 0;
		int temp;
		System.out.println("Actual number is:" + num);
		while (num != 0) {
			temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		System.out.println("Reverse number is:" + rev);
	}

	public void palindromeNumber(int num1) {
		int rev = 0;
		int rem;
		int temp = num1;
		System.out.println("check palindrome for the number:" + num1);
		while (num1 != 0) {
			rem = num1 % 10;
			rev = rev * 10 + rem;
			num1 = num1 / 10;
		}
		System.out.println("palindrome number:" + rev);
		if (temp == rev) {
			System.out.println(" The number is palindrome number:");
		} else {
			System.out.println(" The number is not  palindrome number:");
		}

	}

	public void leapyear(int year) {
		if (year % 4 == 0) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}
	}
}

class Demo extends Operation {
	public void reverseNum(int num) {
		System.out.println("Revrese number() of class Demo");
	}

	public void palindromeNumber(int num1) {
		super.palindromeNumber(num1);
		System.out.println("palindrome number() of  class Demo");

	}

	public void leapyear(int year) {
		super.leapyear(year);
		System.out.println("leap year() of  class Demo");
	}

	void show(int a, int b) {
		int res = +(a + b);
		System.out.println("Addition of number:" + res);
	}

	void show(int a, double b) {
		double res1 = +(a * b);
		System.out.println("multiplication of two numbers:" + res1);
	}
}

public class TotalRecall2 {
	public static void main(String[] args) {
		Operation p1 = new Operation();
		p1.reverseNum(2345);
		p1.palindromeNumber(535);
		p1.leapyear(2021);
		System.out.println("*********************************");
		Demo d1 = new Demo();
		d1.reverseNum(12345);
		d1.palindromeNumber(135);
		d1.leapyear(2020);
		d1.show(5, 6);
		d1.show(8, 4.5);
		System.out.println("**********************************");
		Operation o1 = new Demo();
		o1.reverseNum(2356);
		System.out.println("*********************************");
		Operation e1 = d1;
		e1.leapyear(2022);// here super keyword is used

	}

}
