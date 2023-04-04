package inheritance;

//parent class/super class/base class
class Grandfather {
	Grandfather() {
		System.out.println("I am Grand father constructor");
	}

	void myHome() {
		System.out.println("I am home of Grand father");
	}
}

//sub class/child class/derived class
class Father extends Grandfather {
	Father(double d) {
		// super();// if we don't write then java compiler writw this
		System.out.println("i am class father constructor");
	}

	void mycar() {
		System.out.println("I am car of Father");
	}
}

class child1 extends Father {
	child1(int i) {
		super(12.32);
		System.out.println("I am class child1 constructor");
	}

	void mybike() {
		System.out.println("I am bike of child1");
	}
}

public class Inheritance6 {
	public static void main(String[] args) {
		child1 c1 = new child1(21);// home,car bike
		c1.myHome();
		c1.mycar();
		c1.mybike();
		System.out.println("********************************");
		// here operation like int a=23, int b=a=23
		Father f1 = c1;// father f2= new child1(21);home, car but bike will not be visible/accessible
/*				// to father
father f2= new child1(21);//here constructor also called
*/
		f1.myHome();
		f1.mycar();
		// f1.mybike//bike can not accessible
		System.out.println("********************************");
		Grandfather g1 = c1;// Grandfather g2= new child (21)// home but car , bike will not be
							// visible/accessible to father
		g1.myHome();
		// g1.mycar();//can't accessible
		// g1.mybike();//can't accessible
		System.out.println("***********************************");
		// creating an object or instance of child most class and referred by its parent
		Grandfather g2 = new Father(12.34);// home but car , bike will not be visible/accessible to father
		g2.myHome();
	}

}

/**
 * Debug: line by line execution of program add a break point into the required
 * line use following keys to execute the program F6: for next line F5: to go
 * inside the function/method F8: to resume the execution
 */