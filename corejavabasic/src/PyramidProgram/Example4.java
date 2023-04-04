package PyramidProgram;

public class Example4 {

	public static void main(String[] args) {
		int row=6;
		for (int i = row; i > 0; i--) {// number of lines
			for (int j = 1; j <= i; j++) {// define design
				System.out.print(" ");
			}
		
			for (int j = i; j <= row; j++) {// define patterns
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
