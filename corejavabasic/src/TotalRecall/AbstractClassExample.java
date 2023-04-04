package TotalRecall;

 abstract class Vehicle{
	 int a = 12;
	 abstract void speed();
	 void type() {
		 System.out.println("I am vehicle type method");
	 }
 }
 class car extends Vehicle{
	 int a = 34;
	 void speed() {
		 System.out.println("I am speed() of vehicle");
		 System.out.println(a);
		 System.out.println(super.a);
		// System.out.println(this.a);
	 }
	 void type() {
		 System.out.println("Car type XUV");
	 }
	 void type1() {
		 System.out.println("car type creata");
	 }
	 
 }
public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         car c= new car();
          c.speed();
          c.type();
          c.type1();
          System.out.println("******************");
          Vehicle v = new car();
          v.speed();
          v.type();
        //  v.type1();
        //  Vehicle v1 = new Vehicle();
         //bcoz abstract class we can't create object ... 
	}

}
