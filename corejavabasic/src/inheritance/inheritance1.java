package inheritance;

//super classer parent class
class A1 {
	// java compile write deafault constructor
	static int a = 10;
	int b = 20;
	double c = 13.45;
}

//subclass / child class, B1 inherits class A1 non-static members
class B1 extends A1 {
	// java compiler will write default constructor with default super statement
	static int x = 30;
	int y = 40;
	double z = 53.14;
}

//C1 inherits class B1 non-static members
class C1 extends B1 {
	// java compiler will write default constructor with default super statement
	static int p = 50;
	int q = 60;
	double r = 66.45;
}

public class inheritance1 {

	public static void main(String[] args) {
		// *******Acess static member*******
		System.out.println("class A static member:" + A.a);
		System.out.println("class B static member:" + B.x);
		System.out.println("class C static member:" + C.p);
		System.out.println("*******************************************");
		// benifit of inheritance we create only one object to access non static member
		C1 c1 = new C1();// it will have all the non-static members of class A1,B1 & C1--->b,c,y,z,q,r
		System.out.println("with class c refer:" + c1.b);
		System.out.println("with class c refer:" + c1.c);
		System.out.println("with class c refer:" + c1.y);
		System.out.println("with class c refer:" + c1.z);
		System.out.println("with class c refer:" + c1.q);
		System.out.println("with class c refer:" + c1.z);
		B1 b1 = new B1();// it will have all the non-static members of class A1,B1--->b,c,y,z
		System.out.println("With Class B refer: " + b1.b);
		System.out.println("With Class B refer: " + b1.c);
		System.out.println("With Class B refer: " + b1.y);
		System.out.println("With Class B refer: " + b1.z);
	}
}
