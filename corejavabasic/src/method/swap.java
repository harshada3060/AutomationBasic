package method;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    swap(5,6);
    swap(10,12);
    swap(114,5);
    
	}
static void swap(int a,int b) {
	System.out.println("print a:"+a);
	System.out.println("print b:"+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("swap value of a:" +a);
	System.out.println("swap value of b:"+b);
	
}
}
