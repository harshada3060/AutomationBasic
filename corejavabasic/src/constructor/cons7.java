package constructor;

class B {
	int i = 10;

	B() {
		System.out.println("Running class B constrructor .. ");
		
		i = 23;
	}
}

public class cons7 {

	public static void main(String[] args) {
		System.out.println("main() of cons7 started");
		B b1 = new B();
		System.out.println("class B GV:" + b1.i);
		B b2 = new B();
		System.out.println(+b2.i);
		//System.out.println(+this.i);
	}

}
