package forloop;

public class factorsOfNegativeInteger {

	public static void main(String[] args) {
		int num = -4;
		for (int i = num; i <= Math.abs(num); i++) {
			if (num % i == 0) {
				System.out.println(i);
			} /*else {
				System.out.println("no is not negative integer");
				//continue;
			*/}
		}
	}


