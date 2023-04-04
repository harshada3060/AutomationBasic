package Typecasting;

class JD {
	public void printMe1() {
		System.out.println("Journal Dev print Method");
	}

	void disp() {
		System.out.println("Journal Dev disp Method");
	}
}

class Java extends JD {
	public void printMe2() {
		System.out.println("Java Print Method");
	}

	void disp() {
		System.out.println("Java disp Method");
	}
}

class Android extends Java {
	public void printMe3() {
		System.out.println("Android print method");
	}

	void disp() {
		System.out.println("Android disp method");
	}
}

public class DownCasting1 {
	public static void main(String[] args) {
		JD j1 = new Android();
		j1.printMe1();
		j1.disp();//all disp method same then object  of android disP() OF ANDROID CALL
		System.out.println("**********downcasting to JAVA*********** ");
		Java j2 = (Java) j1;// child chad reference and parent cha object gheto fkat reference variable use
							// krto
		j2.printMe1();
		j2.printMe2();
		j2.disp();
		System.out.println("*********downcasting to Android*********");
		Android a1 = (Android) j1;
		a1.printMe1();
		a1.printMe2();
		a1.printMe3();
		a1.disp();

	}

}
