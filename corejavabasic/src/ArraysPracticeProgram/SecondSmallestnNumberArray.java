package ArraysPracticeProgram;

import java.util.Arrays;

public class SecondSmallestnNumberArray {

	public static void main(String[] args) {
		int[] arr= {10,49,57,25,1,0,38};
		
		Arrays.sort(arr);
		System.out.println("After sorting Array...");
for(int i:arr) {
	System.out.println(i+" ");
}
   
    System.out.println("2nd smallest element is:" +arr[1]);
	}

}
