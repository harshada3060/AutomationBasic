package day1.practice;

public class globlevariable {
	static int empid = 1234;
	int age = 27;

	public static void main(String[] args) {

		System.out.println(globlevariable.empid);

		globlevariable n1 = new globlevariable();
		System.out.println(n1.age);
		n1.age = 25;//re-initialize
		globlevariable n2 = new globlevariable();
		System.out.println(n1.age);
		n2.age = 30;//re initialize
		System.out.println(n2.age);

	}

}
