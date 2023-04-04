package inheritance;

class company1 {
	int age;

	company1() {
		System.out.println("company1 zero para cons");
	}

	company1(double d) {
		this();
		System.out.println("company1 double para cons");
	}

	void Companymethod() {
		System.out.println("company1 Companymethod ");
	}

	void Companymethod(int i) {
		System.out.println("company1 int Companymethod");
		this.Companymethod();
	}
}

class employe1 extends company1 {
	int employe1;

	employe1() {
		super();
		System.out.println("employe1 zero para cons");
	}

	employe1(double a) {
		this();
		System.out.println("employe1 double para cons");
	}

	void Employemethod() {
		super.Companymethod();
		System.out.println("employe1 Employemethod ");
	}

	void Employemethod(int x) {
		this.Companymethod(15);
		System.out.println("employe1 int Employemethod");
	}
}

public class Inheritance10 {

	public static void main(String[] args) {
		company1 c1 = new company1(15.15);
		c1.Companymethod(12);
		employe1 e1 = new employe1(22.22);
		e1.Employemethod(45);
	}
}
