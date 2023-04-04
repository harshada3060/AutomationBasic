package method_overloading;

public class methodeoverloading3 {

	public static void main(String[] args) {
		
		System.out.println(methodeoverloading3.add(12, 13));
		System.out.println(methodeoverloading3.add(1, 6, 8));
		//even you can access static members from other source file as well
		methodeoverloading1.square(3.5);
	}

	static int add(int a, int b) {
		return a + b;

	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}
