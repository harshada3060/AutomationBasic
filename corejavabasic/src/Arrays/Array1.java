package Arrays;

public class Array1 {
	public static void main(String[] args) {
		/*
		//declaration
		int a[];
		//size initialization
		a = new int[5];
		*/
			//or
		int a[]=new int[5];//declaration and instantiation  
		System.out.println(a[0]);  
		System.out.println(a[1]);  
		System.out.println(a[2]);  
		System.out.println(a[3]);  
		System.out.println(a[4]); 
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		System.out.println("*************After initialization*************");
//		System.out.println(a[0]);  
//		System.out.println(a[1]);  
//		System.out.println(a[2]);  
//		System.out.println(a[3]);  
//		System.out.println(a[4]);
//				//or
		System.out.println("Array Element counts: "+a.length);//5
		System.out.println("************normal for loop*************");
		//traversing arrays
		for(int i=0;i<a.length;i++)//length is property of Array 
		{
			System.out.println(a[i]);
			
		}
		System.out.println("***********for each loop***************");
		/**
		 * LHS should be same as RHS(array) type in form of datatype or class
		 * for(LHS : RHS){
		 * 
		 * }
		 */
		for(int num:a) {
			System.out.println(num);
			}
		
		System.out.println("************************************");
		char[] getArray =new char[] { 'A','B','E','C','D' };
			//or
		System.out.println(getArray[3]);//only for value of index value D.
          char[] getArray1 =new char[4];
             getArray1[0]='A';
              getArray1[1]='B';
              getArray1[2]='C';
              getArray1[3]='D';
              //or
		char[] getArray2= {'A','B','C','D'};
		System.out.println("**********for-each-loop ---5************");
	
		for(char ch: getArray) {
			System.out.println(ch);
		}
   }
}
