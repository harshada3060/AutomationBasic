package constructor;

public class consoverloading {
	int age;
	double salary;

	consoverloading() {
		System.out.println("zero para constructor");
	}

	consoverloading(int a) {
		System.out.println("having int parameters");
		age = a;
	}

	consoverloading(double b) {
		System.out.println("having double parameters");
		salary = b;
	}

	consoverloading(int a, double b) {
		System.out.println("having int double parameters");
		age = a;
		salary = b;

	}

	public static void main(String[] args) {
		consoverloading x = new consoverloading();
		System.out.println("after zero para cons age:" + x.age);
		System.out.println("after zero para cons age:" + x.salary);

		consoverloading y = new consoverloading(55);
		System.out.println("after int  para cons age:" + y.age);
		System.out.println("after int para cons age:" + y.salary);

		consoverloading z = new consoverloading(15.99);
		System.out.println("after double  para cons age:" + z.age);
		System.out.println("after double para cons age:" + z.salary);

		consoverloading w = new consoverloading(33,12.56);
		System.out.println("after int_double  para cons age:" + w.age);
		System.out.println("after int _double cons age:" + w.salary);

	}

}
