package This_keyword;

class A {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		
		System.out.println("hello n");
		// m();or
		//this.m();
	}
}

public class ThisKeyword3 {
	void methodeone() {
		System.out.println("Inside methode one");
	}

	void methodeTwo() {
		System.out.println("Inside methode Two");
		// methodeone();or
		this.methodeone();
	}

	public static void main(String[] args) {
		ThisKeyword3 obj = new ThisKeyword3();
		obj.methodeTwo();
		A a = new A();
		a.n();
	}

}
