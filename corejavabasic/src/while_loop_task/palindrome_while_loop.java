package while_loop_task;

public class palindrome_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 535;
		int temp = no;
		int rev = 0, rem;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		if (no == rev) {
			System.out.println(no + "is palindrome number");
		} else {
			System.out.println(no + "is not palindrome number");
		}
	}

}
