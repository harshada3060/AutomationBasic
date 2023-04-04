package This_keyword;

class student {
	int rollno;
	float fee;

	student(int rollno, float fee) {
		rollno = rollno;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + fee);
	}
}

public class Thiskeyword1 {

	public static void main(String[] args) {
		student s1 = new student(111, 3000f);
		s1.display();
		student s2 = new student(112, 6000f);
		s2.display();
	}

}
