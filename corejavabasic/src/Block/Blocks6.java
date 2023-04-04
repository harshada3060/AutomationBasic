package Block;

public class Blocks6 {
	/* SIB */
	static {
		System.out.println("Running static block 1 of class block 2");
	}
	/* NISB OR IIB */
	{
		System.out.println("Running non static block 1 of class block 4");
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		Blocks6 b1 = new Blocks6();
		System.out.println("*************");
		Blocks6 b2 = new Blocks6();
		System.out.println("main() ends");
	}

	static {
		System.out.println("Running static block 2  of class block 2");
	}
	/* NISB OR IIB */
	{
		System.out.println("Running non static block 2 of class block 4");
	}

}
