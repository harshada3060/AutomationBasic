package overridingexamples;

//Base Class or parent class or Super class
class parent {
	void show() {
		System.out.println("parent's show() ");
	}
}

//Inherited class or child class or sub class
class child extends parent {
	@Override
	void show() {
		System.out.println("child's show() ");
	}
}

//Driver class
public class Overriding5 {
	public static void main(String[] args) {
		// If a Parent type reference refers to a Parent object, then Parent's show is
		// called
		parent obj = new parent();
		obj.show();// Parent's show()
		// If a Parent type reference refers to a Child object Child's show() is called.
		// This is called RUN TIME
		// POLYMORPHISM.
		parent obj2 = new child();
		obj2.show();// Child's show()

	}

}
