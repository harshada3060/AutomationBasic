package This_keyword;

public class ThisKeyword21 {
	int a, b;

	// parameterized constructor
	ThisKeyword21(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println(" a=" + a + " b=" + b);// a=10 b=20
	}

	public static void main(String[] args) {
		ThisKeyword21 object = new ThisKeyword21(10, 20);
		object.display();
		System.out.println(object.a + " " + object.b);// 10 ,20
		ThisKeyword21 object2 = new ThisKeyword21(102, 201);
		object2.display();
		System.out.println(object2.a + " " + object2.b);// 102 ,201
	}

}
