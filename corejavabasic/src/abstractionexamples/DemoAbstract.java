package abstractionexamples;

abstract class Abs {

}

abstract class Abs1 {
	// abstract method------------>
	abstract void call1();

	abstract void call2();

	// non- abstract method
	void display() {
		System.out.println("Hello");
	}
}

abstract class Abs2 {
	// abstract method------------>100%
	abstract void call1();

	abstract void call2();
}

abstract class Abs3 {
	// non- abstract method---------->0%
	void display() {
	}
}

public class DemoAbstract extends Abs2 {
	void call1() {
		System.out.println("Hello");
	}

	void call2() {
		System.out.println("he");
	}

	public static void main(String[] args) {
		DemoAbstract d1 = new DemoAbstract();
		d1.call1();
		d1.call2();

	}
}
