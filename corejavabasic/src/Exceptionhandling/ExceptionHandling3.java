package Exceptionhandling;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		try {	int[] a = new int [5];
		a[5]= 30/0;
		
		}
		 catch (Exception e) {
				System.out.println("Parent Exception occurs "+e);
	//erroer bcoz Exception is parent no need to use other 
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBounds Exception occurs "+e);
	} catch (ArithmeticException e) {
		System.out.println("Arithmetic Exception occurs "+e);
//	} catch (Exception e) {
//		System.out.println("Parent Exception occurs "+e);
	}

	}	

}
/**
* unreachable code: a block of code which never executes by JVM
*
*/