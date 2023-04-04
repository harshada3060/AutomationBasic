package Block;

public class Blocks8 {
	int age = 25;
	double salary = 15000.57;

	void print() {
		System.out.println("age:" + age);
		System.out.println("salary:" + salary);
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		Blocks8 b1 = new Blocks8();
		System.out.println("main() ends");

	}

	/* non static block */
	{
		//print();//if we print first then initial value take 15000.57
		salary = 45000.32;
		print();//if we print after updation then updated value take

	}

}
