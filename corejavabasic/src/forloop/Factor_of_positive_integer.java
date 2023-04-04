package forloop;

public class Factor_of_positive_integer {

	public static void main(String[] args) {
		
		int b = 4;
		for (int a = 1; a <= 10; a++) {
			if (b % a == 0)
				System.out.println(a);
		}

	}

}
