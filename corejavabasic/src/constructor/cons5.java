package constructor;

class A {
	int i = 0;

	A() {
		System.out.println("Running class A constructor..");
	}

	void display() {
		System.out.println("I am display() of class A.");
	}
}

class X {
	int j = 10;

	X() {
		System.out.println("Running class X constructor..");
	}

	void display() {
		System.out.println("I am display() of class X");
	}
}

public class cons5 {
	void display() {
		System.out.println("I am display() of cons5.");
	}

	public static void main(String[] args) {
		System.out.println("main() of class cons5 is started...");
		A a1 = new A();
		a1.display();
		System.out.println("class A GV i=" + a1.i);
		X x1 = new X();
		x1.display();
		System.out.println("class X GV j=" + x1.j);
		cons5 c1 = new cons5();
		c1.display();
		System.out.println("main() of class cons5 is end");
	}

}
