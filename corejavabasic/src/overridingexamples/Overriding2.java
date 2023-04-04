package overridingexamples;

class Animal12 {
	public void move() {
		System.out.println("Animal can move");
	}

	void display() {
		System.out.println("I am display() of Animal12 class ");
	}
}

class Dog2 extends Animal12 {
	@Override
	public void move() {
		System.out.println("Dogs can walk and run ");
		display();
	}

	public void calling() {

		move();
		// Animal12 a1=new Animal12();
		// a1.move();
		super.move();
		System.out.println("I am calling");
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		Dog2 b = new Dog2();// dog reference dog object//virtual method calling ji javal aste ti gheto
		b.calling();
		// b.move();
		// super.move();//super and this keywords can not call in main method
	}

}
