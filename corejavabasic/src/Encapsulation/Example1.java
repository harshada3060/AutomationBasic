package Encapsulation;

class Encap{
	private int pinCode=4110;
	private double salary=45000;
	private char grade='A';
	/*implement getter method to access these private data members from outside the class
	 * to write getter method, create a public method with return type as private variable datatype
	 */
	public int getPinCode() {
		return pinCode;
	}
	public char getGrade() {
		return grade;
	}
	public double getSalary() {
		return salary;
	}
	/* setter method will help you to access private data members from outside the class
	 * create a public method with void as return type and argument should match with you private variable datatype
	 */
	public void setPinCode(int pin) {
		pinCode=pin;
	}
	public void setGrade(char Grade) {
		this.grade=grade;
	}
}
public class Example1 {

	public static void main(String[] args) {
		Encap e1=new Encap();
		//as Encap class data members are declared as private, hence we are not allowed to access them from outside the class
//		System.out.println(e1.pinCode);
//		System.out.println(e1.salary);
//		System.out.println(e1.grade);
		System.out.println(e1.getPinCode());		
		e1.setPinCode(210205);
		System.out.println(e1.getPinCode());		
	}
}
