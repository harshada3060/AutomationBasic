package method_overloading;

public class methodoverloading4non_static {

	public static void main(String args[]) {
		methodoverloading4non_static obj = new methodoverloading4non_static();
		obj.disp(100, 20.67);
		obj.disp(1,3.4f);
		obj.disp(12, 20.67,3.6);
	}

	void disp(int a, double b) {
		System.out.println("Method A");
	}

	void disp(int a, double b, double c) {
		System.out.println("Method B");
	}

	void disp(int a, float b) {
		System.out.println("Method C");
	}

}
