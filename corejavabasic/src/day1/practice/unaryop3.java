package day1.practice;

public class unaryop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4, b;
		b = a++ + ++a + ++a + a;
		// 4+6+7+7
		System.out.println("a: "+a);//7
		System.out.println("b: "+b);// 24
		System.out.println("**********************");
		a = 8;
		b = a-- + --a + --a + a;
	 //b 8+6+5+5=24
		System.out.println("a: "+a);// 5 
		System.out.println("b: "+b);// 24 

		a = 15;
		b = --a + --a + --a + a + ++a + a++;
      //14+13+12+12+13+13
		System.out.println(a);// 14
		System.out.println(b);// 77

		a = 7;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		// 6+6+7+7+9+10+10=55
		System.out.println(a);//10
		System.out.println(b);//

	}

}
