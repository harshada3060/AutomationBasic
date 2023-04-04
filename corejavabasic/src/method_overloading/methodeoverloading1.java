package method_overloading;

public class methodeoverloading1 {

	public static void main(String[] args) {
		
		// Method Overloading: any method declare more than once in class body with
		/*
		 * anyone of below rules: 1. type of argument differ or 2. number of
		 * arguments/parameter should differ or 3. position of arguments/parameter
		 * should differ
		 */
		methodeoverloading1.square();
		methodeoverloading1.square(6);
		methodeoverloading1.square(3.5);

	}

	static double res;

	static public void square() {
		System.out.println("No parameter method call");
	}

	static public void square(int number) {
		res = number + number;
		System.out.println("method with integer argument called:" + res);
	}

	static public void square(double number) {
		res = number * number;
		System.out.println("method with double argument called:" + res);
	}
}
