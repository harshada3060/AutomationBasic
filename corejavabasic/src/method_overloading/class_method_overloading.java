package method_overloading;

public class class_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static void main(String[] args) {
		main('a');
		main(10);
	}

	public static void main(int i) {
		System.out.println("I am  main(int)");
	}
	public static void main(char i) {
		System.out.println("I am  main(char)");
	}


	}


