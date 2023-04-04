package abstractionexamples;

abstract class Bike1 {
	abstract void run();

	void speed(int spd) {
		System.out.println("Bike speed :" + spd);
	}
}

class Honda4 extends Bike1 {
	void run() {
		System.out.println("Running safely");
	}

	void speed(int spd) {
		System.out.println("Honda4 speed :" + spd);
		super.speed(120);
	}

	void color() {
		System.out.println("Honda color is blue");
	}
}

class abstactClass1 {
	public static void main(String[] args) {
		Honda4 obj = new Honda4();
		obj.run();
		obj.speed(60);
		obj.color();
		// Bike1 b1 = new Bike1();// we can't create an object of abstract class Bike
		Bike1 b2 = new Honda4();
		b2.run();
		b2.speed(20);
		// b2.color();here we take the reference of bike in the bike class color method
		// is not available

	}

}