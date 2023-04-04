package TotalRecall;

public class SwitchCase2 {

	public static void main(String[] args) {
		int a=2, b= 4,res;
		char op= '*';
		switch(op) {
		
		case '+':
		res= a+b;
		System.out.println(res);
        break;
		case '%':
	    res= a%b;
	    System.out.println(res);
	    break;
		case '-':
		res = a-b;
		System.out.println(res);
		break;
		case '*':
	    res = a*b;
	    System.out.println(res);
	    break;
	    
       default:
    	 System.out.println("Default value"); 
    	 break;
			 
	}
  }

}
