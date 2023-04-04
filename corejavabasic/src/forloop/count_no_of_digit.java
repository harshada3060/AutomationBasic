package forloop;

public class count_no_of_digit {
	 static int getdigit(int num) {
		int ct =0;
		for(;num>0;num=num/10)
		{
			ct++;
		}
		return ct;
	}
	
	public static void main(String[] args) {
		System.out.println((getdigit(123)));
		System.out.println((getdigit(12345)));
		
	}

}
