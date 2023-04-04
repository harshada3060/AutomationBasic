package This_keyword;

public class ThisKeyword6 {
	// globle variable or non static varible or instance variable
	int variable = 51;

	void method(int variable) {
		System.out.println("value of local variable:" + variable);// 20
		variable = 10;
		System.out.println("value of local variable:" + variable);// 10
		System.out.println("value of Instance varible:" + this.variable);// 51
		this.variable = variable;
		System.out.println("value of local varible:" + variable);// 10
		System.out.println("value of instance variable:" + this.variable);// 10
	}

	void method() {
		int variable = 40;
		System.out.println("value of instance variable:" + this.variable);// 51
		System.out.println("value of local varible:" + variable);// 40
		this.variable = variable;
		System.out.println("value of local varible:" + variable);// 40
		System.out.println("value of instance variable:" + this.variable);// 40

	}

	public static void main(String[] args) {
		ThisKeyword6 obj = new ThisKeyword6();
		obj.method(20);
		obj.method();
		System.out.println("value of Instance variable:" + obj.variable);// 51
	}

}
