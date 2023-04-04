package method;

public class static_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personalinfo();
		personalinfo();
		personalinfo();
		personalinfo();
		personalinfo();
		personalinfo ("PRASHANT","ENGINEER","BE");
		personalinfo ("PRASHANT","ENGINEER","BE");
		calling(1234);
		calling(8954);
		int i=12;
		calling(i);
	   
	}
public static void personalinfo()  {
	System.out.println("my name is harshu");
	System.out.println("i am from pune");
    }
public static void personalinfo(String name,String prof,String qualification)
 {
	System.out.println("my name is:"+name);
	System.out.println("i am"+prof+"at erricsson");
	System.out.println("i am completed" +qualification);
	}
public static void calling(int num) {


	System.out.println("calling using number"+num);
	
}
}


