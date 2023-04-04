package overridingexamples;
class person{
	int id;
	String name;
	person(int id, String name){
		this.id=id;
		this.name=name;
		}
}
class Emp extends person{
	float salary;
	Emp(int id,String name,float salary ){
		super(id,name);//reusing parent constructor//to call parent cons super() used
		this.salary=salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}
public class SuperKeyword3 {
   public static void main(String[] args) {
	   Emp e1 = new Emp(1,"ankit",45000f);
	   e1.display();
}
}
