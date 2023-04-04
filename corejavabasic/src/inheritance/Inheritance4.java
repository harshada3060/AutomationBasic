package inheritance;

//--------------------------------Hierachical Inheritance-------------------
//parent class
class Vehicle {
	public void wheels() {
		System.out.println("I have a wheels");
	}
}

//first child class of parent class vehicle
class bike extends Vehicle {
	public void countwl() {
		System.out.println("I am bike has a 2 wheels");
	}
}
//second child class of parent class Vehicle
class car1 extends Vehicle {
	public void countwlc() {
		System.out.println("I am car has a 4 wheels");
	}
}
//third child class of parent class Vehicle 
class scooter extends Vehicle {
	public void countwls() {
		System.out.println("I am scooter has a 2 wheels");
	}
}
public class Inheritance4 {
      public static void main(String[] args) {
		scooter sc = new scooter();// object of scooper
		sc.wheels();
		sc.countwls();
		car1 c = new car1();// object of car
		c.wheels();
		c.countwlc();
		bike b = new bike();
		b.wheels();
		b.countwl();

	}

}
