package ArraysPracticeProgram;

import java.util.Arrays;

public class CopyArray1 {

	public static void main(String[] args) {
		int[] orgArray = {2,6,7,9,4};
		
		System.out.println("print orignal Array");
		for(int i : orgArray) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int[] copyTo = Arrays.copyOf(orgArray,orgArray.length);
		System.out.println("print copy Array");
		
          for(int i=0;i<orgArray.length;i++) {
        	  System.out.print(copyTo[i]+" ");
        	  System.out.println();
          }
			System.out.println(Arrays.equals(orgArray,copyTo));
		}
      
	}


		
//		int[] a= {1,2,4,7,6,8,5,9};
//		for(int i:a) {
//			System.out.println(i+" ");
//			int[] copyTo = Arrays.copyOf(a,a.length);
//			System.out.println("print copy Array");
//			for(int i=0;i<a.length;i++) {
//				System.out.println(copyTO[i]+" ");
//			}
//					
//		}
//	}
