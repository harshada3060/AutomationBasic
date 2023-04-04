package This_keyword;

public class ThisKeyword5 {
	int variable = 5;
	int age = 10;

	void method(int variable) {
		System.out.println("value of variable:" + variable);
		System.out.println("value of globle variable:" + this.variable);
		this.variable = variable;
		System.out.println("value of variable:" + variable);
		System.out.println("value of globle variable:" + this.variable);
	}

	void method() {
		int variable = 40;
		System.out.println("value of variable");

	}

	public static void main(String[] args) {
		ThisKeyword5 obj = new ThisKeyword5();
		obj.method(20);
		obj.method();
		System.out.println("obj GV:" + obj.variable);
		ThisKeyword5 obj2 = new ThisKeyword5();
		System.out.println("obj2 GV:" + obj2.age);

	}

}
