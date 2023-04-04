package TotalRecall;

public class Block {

	static {
		System.out.println("I am Static block1");
	}
	{
		System.out.println("Non Static block 1");
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		Block e = new Block();
		System.out.println("main() ends..");
	}

	static {
		System.out.println("I am Static Block2 ");
	}
	{
		System.out.println("Non Static block 2");
	}
}
