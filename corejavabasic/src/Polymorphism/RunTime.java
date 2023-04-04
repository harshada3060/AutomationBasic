package Polymorphism;

class Animal {
	void eat() {
		System.out.println("Animal Eat");
	}
}

class herbivores extends Animal {
	void eat() {
		System.out.println("Herbivores Eat plants");
	}
}

class omnivores extends Animal {
	void eat() {
		System.out.println("ominivores eat plants and meat");
	}
}

class carnivores extends Animal {
	void eat() {
		System.out.println("carnivores eat meat");
	}
}

public class RunTime {

	public static void main(String[] args) {
		Animal A = new Animal();
		A.eat();// Animal Eat
		Animal h = new herbivores();
		h.eat();
		Animal o = new omnivores();
		o.eat();
		Animal c = new carnivores();
		c.eat();
	}

}
/**
 * When a method gets to know its implementation at the time of execution/rum
 * time is known as run time poly this can be achieved by using method
 * overriding 1. Inheritance 2. Upcasting 3. Method Overriding
 */