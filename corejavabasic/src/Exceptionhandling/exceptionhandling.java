package Exceptionhandling;

public class exceptionhandling {

	public static void main(String[] args) {
		System.out.println("program starts");
		//1.abnormal statement 
		int i = 10;
		int j = i/0;
		System.out.println("res:"+j);
		
		//2.abnormal statements
		int[] empIds = new int[3];
		empIds[3] = 101;
		
		//3.abnormal statements
		String str = null;
		System.out.println(str.length());
		
		//4.abnormal statement 
		String s = "abc";
		int num = Integer.parseInt(s);//
		System.out.println("num:"+num);
		System.out.println("program ends here");

	}

}
