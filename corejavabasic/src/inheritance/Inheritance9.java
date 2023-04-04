package inheritance;
//  when method having same name then we call paren class method in child method by using super keyword
//parent class
class Company202 {
	void display() {
		System.out.println("I am company class display()..");
	}
}

//child class of company
class Employee202 extends Company202 {
	void display() {
		//super.display();
		System.out.println("I am Employee of class display()....");
		super.display();//if we call later then execute later
	}

	void callme() {
		System.out.println("I am Employee of class callme ");
	}
}

public class Inheritance9 {
	public static void main(String[] args) {
		Employee202 e1 = new Employee202();
		e1.display();
		e1.callme();
		System.out.println("****************************");
		Company202 e2 = new Company202();
		e2.display();
		//Company202 e3=new Employee202();
		//e3.display();///extra due to super keyword both display method call
	}

}
