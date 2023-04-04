package Intrefaceexamples;

interface Animal10 {
	int age = 20;

	public void animalSound();

	public void sleep();
}

class pig7 implements Animal10 {
	public void animalSound() {
		System.out.println("The Pig says : wee wee");
	}

	public void sleep() {
		System.out.println("Zzz");
	}
}

public class Interface6 {
	public static void main(String[] args) {
		pig7 mypig = new pig7();
		mypig.animalSound();
		mypig.sleep();
		System.out.println(Animal10.age);

	}
}
