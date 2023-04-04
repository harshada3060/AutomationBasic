package while_loop_task;

public class count_no_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1246790, count = 0;

		while (num > 0) {
			num = num / 10;
			count = count + 1;
		}
		System.out.println("count number of digit:" + count);
	}

}
