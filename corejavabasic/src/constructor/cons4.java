package constructor;

public class cons4 {
	int roll;
	double salary;

	public cons4(int r, double s) {
		roll = r;
		salary = s;
	}

	void display() {
		System.out.println(roll + " " + salary);
	}

	public static void main(String[] args) {
		cons4 c1 = new cons4(33, 346.67);
		c1.display();
		cons4 c2 = new cons4(12, 123.78);
		c2.display();
	}

}
