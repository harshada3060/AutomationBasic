package day1.practice;

public class unaryop1 {

	public static void main(String[] args) {
		int a = 55, b;
		b = a++;//55
		int x = a, y;//
		System.out.println(x);//56 
		y = ++x;// 
		System.out.println(a);// 56
		System.out.println(b);// 55
		System.out.println(x);// 57
		System.out.println(y);// 57

		int p = -10, q = 20, res;
      //res=-10+19=9
		res = p++ + --q;// res = 9
		System.out.println("res: " + res);// 9
		System.out.println("p: " + p);// -9
		System.out.println("q: " + q);// 19
		System.out.println("*****************************");
		int res1 = ++p + ++q;// res1 =
		//res1= -8+20=12
		System.out.println(res1);// 12
		System.out.println("p: " + p);// -8
		System.out.println("q: " + q);//20
	}


	}

