package ArraysPracticeProgram;

class smallest {
	static void min(int num[]) {
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("print smallest number in array: " + min);
	}
}

public class SmallestNum10 {
	public static void main(String[] args) {
		int[] num = { 2, 3, 5, 7, 8, 9 };
		smallest.min(num);

	}

}
