package method;

public class stastic_method2 {

	public static void main(String[] args) {
		// TODO add two numbers
		addtwonumbers(15,5);
		addtwonumbers(100,200);
 System.out.println( multiplytwonumbers(5,6));//method will be executed and we will also able to print it's value in console
multiplytwonumbers(5,6);//method will be executed but we don't be able to print it's return value
	   multiplytwonumbers(2,6);//

	}
static void addtwonumbers(int a,int b) {
	System.out.println("a :" +a);
	System.out.println("b: " +b);
	int res= (a+b);
 System.out.println("result: " +res);
}
	

static int multiplytwonumbers(int n1,int n2) {
	System.out.println("number n1:" +n1);
	System.out.println("number n2 :"+n2);
	int res =(n1*n2);
	System.out.println("result:" +res);
    int finalresult=res+100;
   // System.out.println(finalresult);
    return finalresult;
}
}
