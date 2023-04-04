package Block;

public class Blocks1 {
	/* static block or static initialization block or SIB */
	static {
		System.out.println("******Running static block 1 of class blocks 1***");
	}

	public static void main(String[] args) {
		System.out.println("main()starts..");
		System.out.println("I am main() of class blocks 1...");
		System.out.println("main()ends...");

	}

}
/**
 * SIB- as its doesn't have any name to call for execution, hence it gets executed before main()
 * if you have multiple SIB in the program dn all the SIB will be executed in sequential order
 * its used to provide mandatory information before you gets into actual logic
 */