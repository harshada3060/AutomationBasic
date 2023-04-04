package mockAssignment;

public class swapTwoNumber {

	public static void main(String[] args) {
		int a=3,b=5;
		System.out.println("before swapping a:"+a);
		System.out.println("before swapping b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a:"+a);
		System.out.println("After swapping b:"+b);
	}

}
