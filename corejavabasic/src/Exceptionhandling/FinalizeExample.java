package Exceptionhandling;


public class FinalizeExample {
   public static void main(String[] args) {
	
// finalize - just before destroying any object, garbage collector always calls finalize() to perform clean-up
// activities on that object
			 
	FinalizeExample f1= new FinalizeExample();
    System.out.println(f1.hashCode());
			
			f1=null;
			Object objh;
			System.gc();
			
           System.out.println("Program Ends");		
		}
		public void finalize() {
			System.out.println("Hi, I am your finalize method");
		}
}


