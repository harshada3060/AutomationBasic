package Typecasting;

class pune {
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}

class Mumbai extends pune {
	void kurla() {
		System.out.println("You are in Kurla");
	}
}

public class UpCasting4 extends Mumbai {
	void mycity() {
		System.out.println("You in city");
	}

	public static void main(String[] args) {
		UpCasting4 u1 = new UpCasting4();// auto-upcasting,implicit upcasting
		Mumbai m1 = new UpCasting4();// auto-upcasting,implicit upcasting
		Mumbai m2 = u1;
		pune p1 = new UpCasting4();// auto-upcasting,implicit upcasting
		pune p2 = u1;// auto-upcasting,implicit upcasting

		Mumbai m3 = (Mumbai) new UpCasting4();// explict upcasting
		Mumbai m4 = (Mumbai) u1;// explict upcasting
		pune p3 = (pune) new UpCasting4();
		pune p4 = (pune) u1;

		pune p5 = new Mumbai();// implicit auto-upcasting
		pune p6 = (pune) new Mumbai();// explicit upcasting
		p6.Deccan();
		// p6.kurla();
	}

}
