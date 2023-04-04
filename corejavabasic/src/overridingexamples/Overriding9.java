package overridingexamples;

class parent5 {
	void show() {
		System.out.println("parent's show()");
	}
}

class child5 extends parent5 {
	// This method overrides show() of Parent
	void show() {
		super.show();
		System.out.println("child's show()");
	}
}

class Grandchilds extends child5 {
	// This method overrides show() of Parent
	void show() {
		super.show();
		System.out.println("grandchilds show()");
	}
}

public class Overriding9 {

	public static void main(String[] args) {
		parent5 obj1 = new Grandchilds();
		obj1.show();
	}

}
