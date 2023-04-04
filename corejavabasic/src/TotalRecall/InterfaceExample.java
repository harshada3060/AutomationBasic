package TotalRecall;

interface A1 {
	int age = 32;

	void write();
}

interface B {
	int age = 12;

	void read();
}

public class InterfaceExample implements A1, B {
	public void write() {
		System.out.println("I am write () of class A");
	}

	public void read() {
		System.out.println("I am Read() of class B");
	}

	public void see() {
		System.out.println("I am See() of InterfaceExample ");
	}

	public static void main(String[] args) {

		InterfaceExample i = new InterfaceExample();
		i.write();
		i.read();
		i.see();
		// System.out.println(i.age);
		System.out.println("***********");
		A1 a = new InterfaceExample();
		a.write();
		System.out.println(a.age);

	}

}
