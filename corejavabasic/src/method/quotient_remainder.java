package method;

public class quotient_remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quotientremaider(4,2);
		quotientremaider(10,3);
		quotientremaider(100,20);
		quotientremaider(25,5);
	}
  static void quotientremaider(int a,int b) {
	  System.out.println("a:"+a);
	  System.out.println("b:"+b);
	  int quotient=a/b;
	  int remainder=a%b;
	  System.out.println("quotient is:"+quotient);
	  System.out.println("remainder is:"+remainder);
			  
	  
  }
}
