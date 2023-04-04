package Arrays;

import java.util.Arrays;

public class MD_Array3 {

	public static void main(String[] args) {
		// declaring a source Array
		
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		
		System.out.println("Elements count in copyFrom array: " + copyFrom.length);
		// declaring a destination array
		
		char[] copyTo = Arrays.copyOf(copyFrom, copyFrom.length);
		
		System.out.println("ELements count in copyTo array: " + copyTo.length);
		
		for (int i = 0; i < copyTo.length; i++) {
			System.out.print(copyTo[i] + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.equals(copyFrom,copyTo));
		
		System.out.println("\n ********* copy using range************");
		
		char[] copyWithRange = Arrays.copyOfRange(copyTo, 3, copyTo.length);
		for (int i = 0; i < copyWithRange.length; i++) {
			System.out.print(copyWithRange[i] + " ");
		}
		System.out.println();
		char[] copyWithRange1 = Arrays.copyOfRange(copyFrom, 4, copyFrom.length);
		for (int i = 0; i < copyWithRange1.length; i++) {
			System.out.print(copyWithRange1[i] + " ");
		}
		System.out.println();
		
		System.out.println("compare two arrays");
		System.out.println(Arrays.equals(copyWithRange,copyWithRange1));
		System.out.println("\n **************after sorting*************");
		
		Arrays.sort(copyTo);
		
		for (char c : copyTo) {
			System.out.print(c + " ");
		}
	}
}
