package method_overloading;

public class methodoverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading2 n1= new methodoverloading2();
		n1.square();
		n1.square(6);
		n1.square(4.8f);
		
	}
public void square() {
	System.out.println("No paramere pass");
}
public void square(int number) {
	int res=number+number;
	System.out.println("Method with integer argument called:"+res);
}
public void square(float number) {
	float res=number*number;
	System.out.println("method with floating argument called:" +res);
}
}
