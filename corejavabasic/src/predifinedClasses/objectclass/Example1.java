package predifinedClasses.objectclass;
class Demo{
	void display() {
		System.out.println("I am display()");
	}
}
public class Example1 extends Demo {
	static int last_roll = 100;
	int roll_no;
	//constructor
	Example1(){
		roll_no=last_roll;
		last_roll++;
	}
   //Driver class
	public static void main(String[] args) {
		Demo d1 = new Demo();
     System.out.println(d1);// --->d1.toString();by compiler-----implicit calling
        Demo d3 = new Demo();
        System.out.println(d3.toString());//-----explicit calling
        //below two statements are equivalent
        System.out.println("**********************************");
        Example1 s = new Example1();
        System.out.println(s);
        System.out.println(s.toString());
        
        System.out.println("*********************");
       Demo d2 = s;//new  Example1();
       //when we use reference varible then address will be same and when we use new keyword then object always different
       System.out.println(d2);
       System.out.println(s.equals(d2));
       System.out.println("****************");
       System.out.println(new Example1());
       System.out.println(d2.equals(new Example1()));
	}

}
/**
 * string representation---> fullyqualifiedclassname@hexadecimaladdress	
 * 							 packagename.classname@hexadecimaladdress
 * 
 */