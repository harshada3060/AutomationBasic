package inheritance;
class testing10{
	//default constructor
	void callingFromVoda () {
		System.out.println("Vodaphone network busy");
	}
}
class testing20 extends testing10{
	//default constructor with default super()
	void callingFromIdea () {
		System.out.println("Get idea Sirji");
	}
}
class testing30 extends testing20{
	//default constructor with default super()
	void callingFromAirtel() {
		System.out.println("try everything");
	}
}
public class Example2 extends testing30 {
	//default constructor with default super()
	void callingMe() {
		System.out.println("I am calling....");
	}

	public static void main(String[] args) {
		Example2 e1=new Example2();
		e1.callingMe();
		e1.callingFromAirtel();
		e1.callingFromIdea();
        e1.callingFromVoda();
	}

}
/**
parent class---> super class -----> base class
child class ---> sub class   -----> 

super() ---> used to parent/super class constructor based on parameter
*/