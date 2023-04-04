package extra_activity;

public class staticMethod {

	public static void main(String[] args) {
		add();
		add(10, 5);
		staticMethod n1 = new staticMethod();
		n1.addTwo();
		n1.addTwo(5, 4);
	

	}

	static void add() {
		System.out.println("I am static method ");
	}

	static void add(int num1, int num2) {
		int res = +(num1 + num2);
		System.out.println(+res);
	}

	void addTwo() {
		System.out.println("I am non static method");
	}

	void addTwo(int x, int y) {
		int c = +(x + y);
		System.out.println(+c);
	}

}
