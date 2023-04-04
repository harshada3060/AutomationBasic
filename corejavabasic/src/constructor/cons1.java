package constructor;

public class cons1 {
	cons1() {
		System.out.println("this is zero para constructor");
	}

	 public cons1(char a) {
		System.out.println("this is single para constuctor");
	}

	cons1(int a, int b) {
		System.out.println("this is int int para constructor");
	}

	cons1(double num1, int num2) {
		System.out.println("this is double int para const");
	}

	cons1(int a, double b, int c) {
		System.out.println("this is int double int const");
	}

	public static void main(String[] args) {
		cons1 c1 = new cons1();
		cons1 c2 = new cons1('v');
		cons1 c3 = new cons1(12, 435);
		cons1 c4 = new cons1(10, 2.4, 5);
		cons1 c5 = new cons1(3.5, 4);

	}

}
