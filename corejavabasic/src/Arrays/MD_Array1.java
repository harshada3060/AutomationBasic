package Arrays;

public class MD_Array1 {
	public static void main(String[] args) {
		// declaring and initializing 2D array
		int[][] arr = new int[3][3];// 3 rows 3 clounm
		System.out.println("Array size: " + arr.length);// row count
		for (int i = 0; i < arr.length; i++) {// row count
			for (int j = 0; j < arr[i].length; j++) {// cell or column count on current row
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // NEW LINE
		}
		System.out.println("***************************");
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		// printing 2 D Array
		for (int i = 0; i < arr.length; i++) { // to get row num
			for (int j = 0; j < arr[i].length; j++) { // to get column for above row

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
