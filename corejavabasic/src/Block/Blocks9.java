package Block;

public class Blocks9 {
	final static int age;
	final double salary;

	Blocks9() {
		System.out.println("I am Blocks9 class cons...");
	}

	void print() {
		System.out.println("age :" + age);
		System.out.println("salary:" + salary);
	}

	public static void main(String[] args) {
		System.out.println("main () starts");
		Blocks9 b1 = new Blocks9();
		//b1.print();
		System.out.println("main()ends");
	}

	/* non static member or IIB */
	{
		salary = 45000.32;
		print();
	}
	static {
		age = 25;
	}

}
