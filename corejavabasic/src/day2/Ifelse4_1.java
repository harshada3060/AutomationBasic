package day2;

public class Ifelse4_1 {

	public static void main(String[] args) {

		int age = 20;
		int weight = 30;
		// applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		}
	}

}
