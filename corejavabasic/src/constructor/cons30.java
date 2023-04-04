package constructor;

public class cons30 {
	int roll;
	double salary;

	cons30() {
		System.out.println("zero para start");
		roll = 10;
		salary = 20;
		System.out.println("zero para ends");
	}

	void display() {
		System.out.println(roll + " " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons30 c1 = new cons30();
		c1.display();
		cons30 c2 = new cons30();
		c2.display();
	}

}
/**
 * with parameterize constructor we can initialize each object member with different values
*/