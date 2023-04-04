package abstractionexamples;

//Abstact class
abstract class Animal {
	// Abstract method (does not have a body)
	public abstract void animalSound();

	// Regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}

//Subclass (inherit from Animal)
class pig extends Animal {
	public void animalSound() {
		// the body of animal sound provided here .....we use method without abstract keyword here
		System.out.println("the pig says: wee wee");
	}
}

//Subclass (inherit from Animal)
class Dog8 extends Animal {
	public void animalSound() {
		System.out.println("The dog says:bow bow ");
	}
}

public class abstractClass {

	public static void main(String[] args) {
		pig mypig = new pig();// Create a pig object
		mypig.animalSound();
		mypig.sleep();
		Dog8 d1 = new Dog8();//Create object of dog
		d1.animalSound();
		d1.sleep();
	}

}
