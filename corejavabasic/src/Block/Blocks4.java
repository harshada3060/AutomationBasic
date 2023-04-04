package Block;

public class Blocks4 {
	Blocks4() {
		System.out.println("zero param cons");
	}

	/* non static block or IIB */
	{
		System.out.println("Running of Non static block 1 of class block 4");
	}

	public static void main(String[] args) {
		System.out.println("main()starts");
		Blocks4 b1 = new Blocks4();
		System.out.println("..............");
		Blocks4 b2 = new Blocks4();
		System.out.println("main()ends");

		{
			System.out.println("Running of Non static block 2 of class block4");
		}

	}

}
