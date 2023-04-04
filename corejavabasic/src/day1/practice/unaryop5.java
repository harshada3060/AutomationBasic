package day1.practice;

public class unaryop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b;
		b = a++ + ++a + ++a + a;
		//2+4+5+5
		System.out.println("a: "+a);// 5
		System.out.println("b: "+b);//16
		System.out.println("**********************");
		a = -5;
		b = a-- + --a + --a + a;
	 //-5-7-8-8
		System.out.println("a: "+a);// -8 
		System.out.println("b: "+b);// -28 

		a = -6;
		b = --a + --a + --a + a + ++a + a++;
       //-7-8-9-9-8-8
		System.out.println(a);// -7
		System.out.println(b);// -49

		a = 5;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		//5+4+5+5+7+7+8

		System.out.println(a);//8
		System.out.println(b);//41

	}

}
