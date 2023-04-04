package Exceptionhandling;

public class ExceptionHandling8 {

	//unhandled exception in program
	
		public static void main(String args[]) {
			try {
				System.out.println("Inside the try block");
				// below code throws divide by zero exception
				int data = 25 / 5;
			//System.exit(0);
			//after this program terminates
		    System.out.println(data);
			}
			// cannot handle Arithmetic type exception
			// can only accept Null Pointer type exception
			catch (NullPointerException e) {
				System.out.println(e);
			}
			// executes regardless of exception occured or not
			finally {
				System.out.println("I am inside finally block");
				int k=10/0;
				System.out.println("finally block is always executed");
			}
			System.out.println("rest of the code...");
		}
	}
/**
finally block when not executed  
 1.System.exist(0)
  2.exception occure in finally block ex.int k=10/0
  3.thread death


*/