package overridingexamples;

// final method can not be overriden
class parent3 {
	// can't be overriden
	final void show() {
		System.out.println("I am final method of parent class");
	}
}

class Child3 extends parent3 {
	// This would produce error
	void show() {
		System.out.println("I am show method of child3 class");
	}
}

//driver class
public class Overriding7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Methods can't be overrided private method static method final method
		 * constructor
		 */
	}

}
