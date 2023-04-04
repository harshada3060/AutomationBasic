package ArraysPracticeProgram;

import java.util.Arrays;

public class AsendingSortArray {
	public static void main(String[] args) {
		char[] array = { 'a', 'b', 'r', 'e', 'c', 'd' };

		Arrays.sort(array);
		System.out.println("After sorting orignal Array:");
		for (char i : array) {
			System.out.println(i + " ");
		}

	}

}
