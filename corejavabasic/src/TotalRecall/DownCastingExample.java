package TotalRecall;
class X{
	int a=34;
	public void show() {
		System.out.println("X is Showable....");
	}
	public void print() {
		System.out.println("X is printable....");
	}
}
class Y extends X{
	int b = 43;
	public void show() {
		System.out.println("Y is Showable....");
	}
	public void print() {
		System.out.println("Y is printable....");
   }  
	public void write() {
		System.out.println("Y is Writable....");
	}
}
public class DownCastingExample {

	public static void main(String[] args) {
		Y y1 = new Y();
		y1.print();
		y1.show();
		y1.write();
		System.out.println(y1.a);
		System.out.println(y1.b);
		System.out.println("******************");
		X x1 = new X();
		x1.print();
		x1.show();
		//x1.write();
		System.out.println(x1.a);
		System.out.println("*******************");
		//implicit upcasting
		X x2 = new Y();
		x2.print();
		x2.show();
	//	x2.write();
		System.out.println(x2.a);
		System.out.println("**************");
		//explicit upcasting
		X x3 = (X)y1;
		x3.print();
		x3.show();
		//x3.write();
		//downcasting
		System.out.println("*****************");
		Y y3 = (Y) x2;
		y3.print();
		y3.show();
	}

}
