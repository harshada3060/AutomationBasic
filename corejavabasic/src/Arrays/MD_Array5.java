package Arrays;

import java.util.Arrays;

public class MD_Array5 {
  public static void main(String[] args) {
		//declaring a source Array
		char[] orgArray= {'a','b','e','c','d'};
        //duplicate Array
		//char[] cloneArray= orgArray.clone();
		
		//sorting copy from in ascending order
		Arrays.sort(orgArray);
		
		char[] cloneArray= orgArray.clone();
		
		System.out.println("After sorting Orignal Array: ");
		
		for(char c: orgArray) {
			System.out.print(c+" ");
		}
		//clone array
		System.out.println("\n clone Array");
		
		for(char c: cloneArray) {
			System.out.print(c+ " ");
		}
		System.out.println("\n+++++++++++++++++++++++++++++++");
		
		boolean result=Arrays.equals(cloneArray, orgArray);
		
		System.out.println(result);
	}

}
//if we add later e then result will be false befor Adding 'e'result will be true