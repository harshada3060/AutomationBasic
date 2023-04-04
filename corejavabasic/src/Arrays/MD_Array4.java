package Arrays;

import java.util.Arrays;

public class MD_Array4 {
  //java program to clone the Array
	public static void main(String[] args) {
		
		int array[] = {33,3,4,5};
		
		System.out.println("printing orignal array: ");
		
		for(int i: array) {
			System.out.print(i+" ");
		}
		//clone array
		System.out.println("\nPrinting clone of the array:");
		
		int cloneArray[] = array.clone();
		
		for (int i : cloneArray) {
			System.out.print(i+ " ");
		}
		//copy of array
		System.out.println("\n Are both equal arr & clone array? ");
		
		System.out.println("array and clone array content validation :"+Arrays.equals(array,cloneArray));
		System.out.println("*************************************");
		
		int newCopiedArray[] = Arrays.copyOf(array,array.length);
		
		for(int i:newCopiedArray ) {
			
			System.out.print(i+" ");
		}
		//new copy of range array
		System.out.println("\n********************");
		
		int newCopiedRangeArray[] = Arrays.copyOfRange(array,1,2);
		
		for(int i:newCopiedRangeArray) {
			System.out.println(i+" ");
		}
		
	System.out.println("\nComparing newCopiedRangeArray & newCopiedArray : "
					+Arrays.equals(newCopiedArray, newCopiedRangeArray));
	
	System.out.println("********************************");
	
	//sort the array elements in ascending order and stores the sorted element in the same array
	Arrays.sort(array);
	
	System.out.println("After sorting orignal Array:");
	
	for(int i:array) {
		System.out.print(i+" ");
		
	}
	System.out.println();
	
	System.out.println(Arrays.equals(array,cloneArray));
	}

}
