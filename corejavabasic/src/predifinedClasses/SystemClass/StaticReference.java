package predifinedClasses.SystemClass;
class Demo{
	void display() {
		System.out.println("Demo class display method..");
	}
	void callme() {
		System.out.println("Demo class callme method().");
	}
	Demo(){
		System.out.println("Demo class cons..");
	}
}
public class StaticReference {
      static final Demo demoRef = new Demo();
      
     static int age=30;
     static void calling()	{
    	 System.out.println("calling...");
     }
   //class.static-ref.nonstatic-method
void test() {
	System.out.println("StaticReference class test method..");
     }
public static void main(String[] args) {
	//access Demo class non-static member
	Demo d1 = new Demo();
	d1.display();
	d1.callme();
	
	StaticReference s1 = new StaticReference();
	s1.test();
	
	StaticReference.calling();
	System.out.println(StaticReference.age);
	
//  classname.staticref.methodname
	StaticReference.demoRef.display();
	StaticReference.demoRef.callme();
	
//classname.staticRef.method
	System.out.println("Hello");
	System.err.println("I am an error msg");
	
    }
}
