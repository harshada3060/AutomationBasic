package mockAssignment;

public class reverseNumber {

	public static void main(String[] args) {
		int rev = 0, temp;
		System.out.println("Actual number:" + 1234);
		for (int num = 1234; num > 0; num = num / 10) {
			temp = num % 10;
			rev = rev * 10 + temp;

		}
		System.out.println("Reverse numer:" + rev);

	}
}
