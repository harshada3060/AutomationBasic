package overridingexamples;

class ABC {
	public void myMethod() {
		System.out.println("Method of ABC class");
	}
}

class Overriding4 extends ABC {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of class overriding 4");
		// super.myMethod();
	}

	public static void main(String[] args) {
		Overriding4 obj = new Overriding4();
		obj.myMethod();
	}

}
