package overridingexamples;

class parent2 {
	private void m1() {
		System.out.println("from parent m1()");
	}

	protected void m2() {
		System.out.println("from parent m2()");
	}
}

class child2 extends parent2 {
	private void m1() {
		System.out.println("from chid m1()");
	}

	@Override
	public void m2() {
		m1();
		System.out.println("from child m2()");
	}
}

public class Overriding6 {
	public static void main(String[] args) {
		parent2 obj1 = new parent2();
		obj1.m2();
		// obj1.m1();//private members can't be access from outside the class
		parent2 obj2 = new child2();
		obj2.m2();
		// obj2.m1();//private members can't be access from outside the class

	}

}

/**
In java we can increase the visibility of members but we can not decrease it
(private----> default or protected or public), not possible(public ---> default or private or protected)

private member of parent class can't be overriden


*/
