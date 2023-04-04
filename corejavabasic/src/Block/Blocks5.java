package Block;

public class Blocks5 {
	static {
		System.out.println("Running block 1 of class block5");
	}
	{
		System.out.println("Running Non static block 1 of class block5");
	}

	public static void main(String[] args) {
		System.out.println("main() starts ");
		Blocks5 b1 = new Blocks5();
		System.out.println("***********");
		Blocks5 b2 = new Blocks5();
		System.out.println("main() ends");
	}

}
