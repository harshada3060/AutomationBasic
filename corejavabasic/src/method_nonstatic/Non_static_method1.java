package method_nonstatic;

public class Non_static_method1 {

	public static void main(String[] args) {
		 //to access non-static member create an instance of the class
		Non_static_method1  n1=new Non_static_method1 ();
		n1.personalInfo();
		n1.personalInfo();
		n1.personalinfo("prashat","Engineer","BE");
		n1.calling(2345);
		n1.calling(1267);
		int i=2678;
		n1.calling(i);
		
		
	}

	public void personalInfo() {
		System.out.println("i am harshu");
		System.out.println("i am from pune");
	}
	public  void personalinfo(String name,String prof,String qualification)
	 {
		System.out.println("my name is:"+name);
		System.out.println("i am"+prof+"at erricsson");
		System.out.println("i am completed" +qualification);
		}
	public void calling(int num) {
		System.out.println("calling using number"+num);
	}
}
