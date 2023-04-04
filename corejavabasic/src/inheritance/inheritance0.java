package inheritance;

class A {
	static int a = 10;
	int b = 20;
	double c = 13.45;
}

class B {
	static int x = 30;
	int y = 40;
	double z = 53.14;
}

class C {
	static int p = 50;
	int q = 60;
	double r = 66.45;
}

public class inheritance0 {

	public static void main(String[] args) {
//*******Acess static member*******
		System.out.println("class A static member:" + A.a);
		System.out.println("class B static member:" + B.x);
		System.out.println("class C static member:" + C.p);
		// *********Acess Non static member***********
		A a1 = new A();
		System.out.println("class A Non static member b:" + a1.b);
		System.out.println("class A Non static member c:" + a1.c);
		B b1 = new B();
		System.out.println("class B non static member y:" + b1.y);
		System.out.println("class B non static member z:" + b1.z);
		C c1 = new C();
		System.out.println("class c non static member q:" + c1.q);
		System.out.println("class c non static member r:" + c1.r);

	}

}
