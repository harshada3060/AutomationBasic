package Typecasting;

class GrandParent {
	void myHome() {
		System.out.println("Home belongs to grand parent");
	}
}

class parent extends GrandParent {
	void show() {
		System.out.println("parent show message is called");
	}

	void callme() {
		System.out.println("parent callme method called");
	}
}

class child extends parent {
	void readme() {
		System.out.println("child readme method is called");
	}
}

public class UpCasting2 {

	public static void main(String[] args) {
		System.out.println("***********reference of child and object of child**********");
		child c1 = new child();
		c1.readme();
		c1.callme();
		c1.show();
		c1.myHome();
		System.out.println("********Ref and object of both parent*********** ");
		parent p1 = new parent();
		p1.callme();
		p1.show();
		p1.myHome();
		System.out.println("********Ref and object of both Grandparent*********** ");
		GrandParent g1 = new GrandParent();
		g1.myHome();
		System.out.println("*******Ref of parent child object**********");
		parent obj = c1;
		obj.show();
		obj.callme();
		obj.myHome();
		// obj.readme();
		System.out.println("***********Ref of Grandparent and object of child*************");
		GrandParent g11 = c1;
		g11.myHome();

	}

}
