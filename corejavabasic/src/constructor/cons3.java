package constructor;

public class cons3 {
	int roll;
	double salary;

	void display() {
		System.out.println(roll + " " + salary);
	}

	public static void main(String[] args) {
		
		cons3 s = new cons3();
		s.display();
	}

}
