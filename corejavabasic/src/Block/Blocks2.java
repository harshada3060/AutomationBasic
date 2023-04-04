package Block;

public class Blocks2 {
	/* static block or static initialization block or SIB */
	static {
		System.out.println("******Running static block 1 of class blocks 2***");
	}

	public static void main(String[] args) {
		System.out.println("main()starts..");
		System.out.println("I am main() of class blocks 1...");
		System.out.println("main()ends...");

	}

	/* static block or static initialization block */
	static {
		System.out.println("*****Running static-block2 of class block2**** ");
	}

}
