package method_overloading;

/**
 * Question 2 – return type is different. Method name & argument list same.
 */
public class methodOverloading7
{
   public double myMethod1(int num1, int num2)
   {
      System.out.println("First myMethod of class Demo");
      return num1+num2;
   }
   public int myMethod(int var1, int var2)
   {
      System.out.println("Second myMethod of class Demo");
      return var1-var2;
   }
   public static void main(String args[])
   {
      methodOverloading7 obj2= new methodOverloading7();
      obj2.myMethod1(10,10);
      obj2.myMethod1(20,12);
   }
}