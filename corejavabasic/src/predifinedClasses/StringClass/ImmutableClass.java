package predifinedClasses.StringClass;
/**
 * Immutable Class: its value can't be changed, if you change new object will be created
 * 1. class and data variable should be declared as final
 * 2. constructor should be parameterized, to initialize final data variable
 * 3. use only getter method to get final variables value
 */
final class TestImmutableClass{
	final String name;
	final int Salary;
	TestImmutableClass(String s1,int num1){
		name = s1;
		Salary = num1;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return Salary;
	}
	
}
public class ImmutableClass {
    public static void main(String[] args) {
    	TestImmutableClass t1 = new TestImmutableClass("Nisha",100000);
    	System.out.println(t1.getName());
    	System.out.println(t1.getSalary());
     //   t1.name = "harshu";
	//	t1.Salary=50000;
    	
    	TestImmutableClass t2=new TestImmutableClass("Harshu",250003);
		System.out.println(t2.getName());
		System.out.println(t2.getSalary());
	}

}
