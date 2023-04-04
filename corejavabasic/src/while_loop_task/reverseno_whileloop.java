package while_loop_task;

public class reverseno_whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0, temp;
		int num = 254;
		while (num != 0) {
			temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;

		}
		System.out.println("reverse numberis:" + rev);
	}

}
