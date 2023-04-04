package Polymorphism;

class car {
	int price = 25000;
    void run() {
		System.out.println("running");
	}
}

class innova extends car {
	int price = 50000;
    void run123() {
		System.out.println("running fast at 120km ");
	}
}

public class Runtime3 {
	public static void main(String[] args) {
		car C = new innova();
		C.run();
		System.out.println(C.price);
	}
}
//when method name same then object method call 
//when method name diff then reference method call  in this program method name diff i.e run() &rum123()