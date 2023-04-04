package overridingexamples;

class parent4 {
	// Static method in base class which will be hidden in subclass
	static void m1() {
		System.out.println("from parent" + " static m1()");
	}

	void m2() {
		System.out.println("from parent " + "non static (instance) m2()");
	}
}

class child4 extends parent4 {
	// This method hides m1() in Parent
	static void m1() {//static can't override thats y m1 of parent print
		System.out.println("from child static m1()");
	}

	// This method overrides m2() in Parent
	@Override
	public void m2() {
		System.out.println("from child" + " non static (instance) m2()");
	}
}

//driver class
public class Overriding8 {
     public static void main(String[] args) {
		parent4 obj1 = new child4();
		obj1.m1();
		// Here overriding works and Child's m2() is called
		obj1.m2();
	}
}
