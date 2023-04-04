package overridingexamples;
 class Animal7 {
	void eat() {
		System.out.println("eat() of Animal 7 class..");
	}
}
class Dog7 extends Animal7 {
	void eat() {
		System.out.println("eat() of Dog 7 class.. ");
	}
 void bark() {
		System.out.println("bark() of Dog 7 class...");
	}
  void work() {
		super.eat();//parent chi gheil
		bark();
		eat();
		System.out.println("work() of Dog 7 class");
	}
}
public class SuperKeyword2 {
	public static void main(String[] args) {
		Dog7 d = new Dog7();
		d.work();
	}
}
