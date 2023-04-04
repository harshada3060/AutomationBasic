package method_nonstatic;

public class quotient_remainder_non_static {

	public static void main(String[] args) {
		quotient_remainder_non_static n1= new quotient_remainder_non_static();
		n1.quotientRemaider(8,4);
		n1.quotientRemaider(10,3);
		n1.quotientRemaider(100,20);
		n1.quotientRemaider(25,5);
	}
   void quotientRemaider(int a,int b) {
	  System.out.println("a:"+a);
	  System.out.println("b:"+b);
	  int quotient=a/b;
	  int remainder=a%b;
	  System.out.println("quotient is:"+quotient);
	  System.out.println("remainder is:"+remainder);
			  

	}

}
