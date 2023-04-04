package TotalRecall;

class flower {
	
	int age = 27;

	flower() {
		System.out.println("I am flower class cons");
	}

	void smell() {
		System.out.println("I am smell() of flower");
	}

	void colour() {
		System.out.println("I am multicolour");
	}
}

class rose extends flower {
	int age = 30;

	rose() {
		super();
		System.out.println("Rose class cons");
	}

	public void type() {
		System.out.println("I am pleasent type");
		System.out.println(age);
		System.out.println(super.age);
	}
}

class chameli extends flower {
	public void apperence() {
		System.out.println("my clr white");
		System.out.println(super.age);
	}
}

class champa extends rose {
	public void eccense() {
		System.out.println("I have Good eccense");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {

		flower f = new flower();

		f.smell();
		f.colour();
		System.out.println(f.toString());

		System.out.println("*************");

		rose r = new rose();

		r.smell();
		r.colour();
		r.type();

		System.out.println("***********");

		flower fr = new rose();

		fr.colour();
		fr.smell();
		// fr.type();

		System.out.println("**************");

		champa cr = new champa();

		cr.colour();
		cr.smell();
		cr.type();
		cr.eccense();

		System.out.println("***************");

		rose cr1 = new champa();

		cr1.colour();
		cr1.smell();
		cr1.type();
		// cr1.eccense();
		System.out.println("*******************");

		flower cf = new chameli();

		cf.smell();
		cf.colour();
		// cf.appearence();
		System.out.println("********************");

		chameli c = new chameli();

		c.apperence();
		c.colour();
		c.smell();

	}

}
