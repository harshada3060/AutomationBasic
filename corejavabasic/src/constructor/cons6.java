package constructor;

class c {
	double i = 10.36;

	c(double j) {
		System.out.println("Running class c constuctor ");
		i = j;
	}
}

public class cons6 {
	public static void main(String[] args) {
		System.out.println("main() of class cons6 is started ");
		c b1 = new c(15.38);
		System.out.println(+b1.i);
		System.out.println("******************************");
		c b2 = new c(45.32);
		System.out.println("Class C global variable i = " + b2.i);
		System.out.println("Main() of Class Cons5 is ends here...");
	}

}
