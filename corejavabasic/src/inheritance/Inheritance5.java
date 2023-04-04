package inheritance;

//--------------------multiple Inheritance ----------
class A2 {
	void msg() {
		System.out.println("Hello");
	}
}

class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}

// Error bcoz java doesn't support multiple inheritance
class Inheritance5 extends A2,B2{//

	Inheritance5() {
		super();// confusion
	}

	public static void main(String args[]) {
		Inheritance5 obj = new Inheritance5();
		obj.msg();
	}
}
/**
 * is java supports multiple inheritance or not?//no why java doesn't support
 * multiple inheritance using classes?//bcoz mbguit
 */

}
