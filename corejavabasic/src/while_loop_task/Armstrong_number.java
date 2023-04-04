package while_loop_task;

public class Armstrong_number {// armstrong number is equal to sum of cube of its digit

	public static void main(String[] args) {
		int num = 153, res = 0, temp, sum = num;
		while (num > 0) {
			temp = num % 10;
			res = res + temp * temp * temp;
			num = num / 10;

		}
		if (sum == res) {
			System.out.println("It is Armstrong number");
		} else {
			System.out.println("It is not Armstrong number");
		}
	}

}
