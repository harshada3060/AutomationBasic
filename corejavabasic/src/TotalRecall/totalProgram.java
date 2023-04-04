package TotalRecall;

public class totalProgram {
	// Globlal variable----->static and non-static globle varible
	static final int empid = 1001;
	static int age;
	final double salary;

	// blocks--->static and non static blocks
   static {
		age = 35;
		System.out.println("Total recall static block");
		System.out.println(+age);
    }
    {
		// salary=9999.0;
		System.out.println("Total recall Non-static block");
		// System.out.println(salary);
	}
    //method or function
	static void display() {
		System.out.println("I am static method display");
	}
    public void print() {
		System.out.println("I am non-static method print()");
	}
    // method overloading
	public void print(int x,int y)
	{
	   int res=+(x+y);
		System.out.println(+res);
		//System.out.println("age" + age + " salary" + salary);
	}

	// constructor
	totalProgram() {
		this(45, 4567.5);// this statement

		System.out.println("I am zero para constructor");
	}

	// constructor overloading
	totalProgram(int age, double salary) {
		this.salary = 9999.0;// this keyword

		System.out.println("age:" + age + " salary" + salary);

	}

	public static void main(String[] args) {
		System.out.println("main()starts");
		System.out.println(empid);
		totalProgram n1 = new totalProgram();
		
		totalProgram n2 = new totalProgram(40, 10000);
		display();// static method call
		n1.print();// non static method call
		n2.print(10,40);
		System.out.println("main()ends");
		System.out.println(n2.salary);// by using this keyword aapan this keyword la main method madhe nahi call karu
										// shakt

	}

}
