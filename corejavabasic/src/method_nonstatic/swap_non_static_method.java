package method_nonstatic;

public class swap_non_static_method {

	public static void main(String[] args) {
		//swap numbers by non static method
		swap_non_static_method s1=new swap_non_static_method();
	   s1. swap(5,6);
	   s1. swap(10,12);
	   s1. swap(114,5);
	    
		}
	 void swap(int a,int b) {
		System.out.println("print a:"+a);
		System.out.println("print b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swap value of a:" +a);
		System.out.println("swap value of b:"+b);
		

	}

}
