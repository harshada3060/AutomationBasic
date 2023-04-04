package day1.practice;

public class unaryop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -5, b;
		b = a++ + ++a + ++a + a;
		//  -5-3-2-2=12
		System.out.println("a: "+a);// -2
		System.out.println("b: "+b);// -12
		System.out.println("**********************");
		a = -7;
		b = a-- + --a + --a + a;
	 //-7-9-10-10=-36
		System.out.println("a: "+a);//- 10
		System.out.println("b: "+b);// -36 

		a = 7;
		b = --a + --a + --a + a + ++a + a++;
     //     6+5+4+4+5+6
		System.out.println(a);// 6
		System.out.println(b);// 

		a = -9;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		//-10-10-9-8-7-6-6=
		System.out.println(a);//
		System.out.println(b);//

	}

}
