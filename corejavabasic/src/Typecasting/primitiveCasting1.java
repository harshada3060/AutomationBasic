package Typecasting;

public class primitiveCasting1 {

	public static void main(String[] args) {
		int myInt = 9;
//widening implicit, when java compiler writes behalf of you--> double myDouble =(double)myInt;
		double myDouble = myInt;

		double d = (double) myInt;// explicit widening
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(d);

		double salary = 23400.678568567848d;
		int sal = (int) salary;// narrowing, always explicit 
		long f = (long) salary;// narrowing,explicit
		float f1 = (float) salary;// narrowing,explicit
		System.out.println("Actual salary:" + salary);
		System.out.println("Int salary:" + sal);
		System.out.println("long salary:" + f);
		System.out.println("flaot salary:" + f1);
	}

}
