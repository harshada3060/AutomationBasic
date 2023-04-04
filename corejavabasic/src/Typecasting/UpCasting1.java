package Typecasting;

class Parent100 {
	void myHome() {
		System.out.println("parent Home");
	}
}

class child100 extends Parent100 {
	void myCar() {
		System.out.println("child car");
	}
}

public class UpCasting1 {

	public static void main(String[] args) {
		child100 c2 = new child100();
		c2.myCar();
		c2.myHome();
		Parent100 c1 = new Parent100();
		c1.myHome();
		System.out.println("**************using upCasting************");
		child100 c3 = new child100();
		c3.myCar();
		c3.myHome();
		Parent100 c4 = c3;// ---->implicit/auto-Upcasting--->parent100 c4 = new child100();
		c4.myHome();
		Parent100 p2 = new child100();// implicit/auto upcasting
		Parent100 p3 = (Parent100) new child100();// explicit up-casting
		Parent100 p4 = (Parent100) c3;// explicit up-casting
       
	}

}
