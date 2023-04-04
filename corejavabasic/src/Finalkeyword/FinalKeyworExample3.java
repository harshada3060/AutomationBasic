package Finalkeyword;

public class FinalKeyworExample3 {
	final int id;

	FinalKeyworExample3(int i) {
		//id = i;//by using cons
	}
	{
		id=2;//by using non static block
	}

	public static void main(String[] args) {
		FinalKeyworExample3 f1 = new FinalKeyworExample3(25);
		System.out.println(f1.id);
	}

}
/**
 * Local variable can be declared as final and initialize later based on requirement
 * for final Global variables, its mandatory to declared and initialize both at the same time
 * 		but for non-static final global variable you are allowed to initialize its value using constructor/non-block
 *		but for static final global variable you are allowed to initialize its value using static block
 */ 