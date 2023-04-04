package getter_setter;
class Demo{
	private int empid=1000;
	private double salary= 45000;
	/*generate getter for empID and salary*/

	public int getempid () {
	return empid;
}
	public double getsalary() {
		return salary;
	}
	/*generate setter for empID and salary*/
	public void setempid(int id) {
		empid=id;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
}
public class Encap0 {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		//System.out.println(d1.empid);//compile time error
       // System.out.println(d1.salary);//compile time error
 System.out.println("Accessing private data member outside the class using getter concept- empID: "+d1.getempid());
System.out.println("Accessing private data member outside the class using getter concept- salary: "+d1.getsalary());
System.out.println("*************upadating private data members***********");
       d1.setempid(1001);
       d1.setsalary(550000);
       System.out.println("Updated, Accessing private data member outside the class using getter concept- empID: "+d1.getempid());
		System.out.println("Updated, Accessing private data member outside the class using getter concept- salary: "+d1.getsalary());
		System.out.println("***********************************");
		Demo d2=new Demo();
		System.out.println("Accessing private data member outside the class using getter concept- empID: "+d2.getempid());
		System.out.println("Accessing private data member outside the class using getter concept- salary: "+d2.getsalary());
	  }

	}
/**
 * In order to access private variable outside the class we need implement getter method
 * 		--> getter method--> helps to access private variable from outside the class
 * 				--> declared with public 
 * 				--> return type of this method should be same as private variable
 * 				--> it should return private variable
 * In order to modify private variable outside the class we need implement setter method
 * 		--> setter method--> helps to modify private variable from outside the class
 * 				--> declared with public 
 * 				--> return type of this method is void 
 * 				--> parameter datatype should be same as private variable
 */

