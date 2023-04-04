package forloop;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0, temp;
		System.out.println("Actual number:" + 234);
		for (int num = 234; num > 0; num = num / 10) {
			temp = num % 10;
			rev = rev * 10 + temp;
		}
		System.out.println("rever number is:" + rev);
	}

}
