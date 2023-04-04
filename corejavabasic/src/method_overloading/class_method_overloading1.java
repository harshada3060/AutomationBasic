package method_overloading;

public class class_method_overloading1 {

			public void disp(int num,char c) {
			System.out.println(num+" "+c);
		}
		public void disp(char c, int num) {
			System.out.println(c + " " + num);
		}
	
	//public class MethodOverloading4 {
		public static void main(String args[]) {
			DisplayOverloading obj = new DisplayOverloading();
			obj.disp(25,'x');
			obj.disp('a', 10);
			MethodOverloading4 m1=new MethodOverloading4();
			m1.call();
		}
		public void call() {
			System.out.println("calling");
		}

	}

}
