package TotalRecall;


 class A {
	 
	static int age= 27;
	double Salary =35000.0;
	
	A(int p,int q){
		System.out.println(this.Salary);
		age=p;
		System.out.println(age);
	    Salary = q;
	    System.out.println(this.Salary);
	    System.out.println("********************");
	 }
	A(int c,int d,double e){
		this(35,40);
	}
	public static void myMethod() {
		System.out.println("Hello I am Static()");
	}
	public static int myMethod(int a,int b) {
		return a+b;
	}
	void nonStaic() {
		System.out.println("Hello I am Non_ Static()");
	}
	public double nonStatic(int x,double y) {
		return x+y;
	}
 }
public class TotalRecall3 {
    public static void main(String[] args) {
		A d1 = new A(2,4);
		A d2 = new A(3,4,6.0);
		A.myMethod();
		System.out.println(A.myMethod(5,6));
		System.out.println(d1.nonStatic(34,56.0));
		d1.nonStaic();
	}

	

}
