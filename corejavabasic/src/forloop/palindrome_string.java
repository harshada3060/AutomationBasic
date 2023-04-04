package forloop;

public class palindrome_string {

	public static void main(String[] args) {
		
	
		String ch = "harshada";
			String a ="";
			
				for (int i = ch.length() - 1; i >= 0; i--) {
					a = a + ch.charAt(i);
				}
				System.out.println(a);
         
	} 

}
