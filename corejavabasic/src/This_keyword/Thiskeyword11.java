package This_keyword;

class student1 {
	int rollno;
	float fee;

	student1(int rollno, float fee) {
		System.out.println("LV:" + rollno);
		System.out.println("LV:" + fee);
		System.out.println(" initial GV rollno:" + this.rollno);
		System.out.println("initial GV fee :" + this.fee);
		// globle variable =local varial
		this.rollno = rollno;
		this.fee = fee;
		System.out.println("updated GV:" + this.rollno);
		System.out.println("updated GV:" + this.fee);
	}

	void display() {
		System.out.println(rollno + " " + fee);
	}
}

public class Thiskeyword11 {

	public static void main(String[] args) {
		student1 s1 = new student1(111, 300f);
		s1.display();
		student1 s2 = new student1(134, 6600f);
		s2.display();

	}

}
