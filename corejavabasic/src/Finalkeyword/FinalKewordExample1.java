package Finalkeyword;

public class FinalKewordExample1 {
static final int id;
	public static void main(String[] args) {
		final int age;
		age=25;
		//you cann't initialize final global variable after declaration
         id=25;
	}
	/**
	 * Local variable can be declared as final and initialize later based on requirement
	 * for final Global variables, its mandatory to declared and initialize both at the same time
	 */ 

}
