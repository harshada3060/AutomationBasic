package ArraysPracticeProgram;

import java.util.Arrays;

import java.util.Collections;

public class DesendingSortArray {

	public static void main(String[] args) {
		Integer[] arr = { 5, 8, 9, 4, 1, 3, 5 };
		Arrays.sort(arr, Collections.reverseOrder());

		for (int values : arr) {
			System.out.println(values + " ");
		}

	}

}
