package forloop;

public class prime_number {

	public static void main(String args[]) {

		int no = 30;
		int temp = 0;
		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println("not prime");
		} else {
			System.out.println("prime");
		}
	}
}