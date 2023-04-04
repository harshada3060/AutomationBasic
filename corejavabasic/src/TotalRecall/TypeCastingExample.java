package TotalRecall;

public class TypeCastingExample {

	public static void main(String[] args) {
		int age = 23;
		// implicit widening
		System.out.println("*******implict widening*********");
		double myage = age;
		float myage1 = age;
		long myage3 = age;
		System.out.println(+age);
		System.out.println("double age:" + myage);
		System.out.println("float age: " + myage1);
		System.out.println("long age: " + myage3);
		System.out.println("******explicit widening***********");
		double d = (double) age;
		float f = (float) age;
		System.out.println("d:" + d + "\nf:" + f);

		System.out.println("*******explicit narrowing**********");
		double salary = 50000.0;
		int i = (int) salary;
		byte b = (byte) salary;
		float f1 = (float) salary;
		long l = (long) salary;
		System.out.println("i:" + i + "\nb:" + b + "\nf1:" + f1 + "\nl:" + l);

	}

}
