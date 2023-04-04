package mockAssignment;

public class palindromeString {

	public static void main(String[] args) {
		String str = "Radar";
		String ReverseStr = "";
		 int StringLength = str.length();
		for(int i=StringLength-1;i>=0;--i) {
			ReverseStr = ReverseStr+str.charAt(i);
			}
		System.out.println(ReverseStr);
//		if (str.equalsIgnoreCase(ReverseStr)) {
//			System.out.println(str+"is palindrome");
//		}else {
//			System.out.println(str+"is not palindome");
//		}
	}

}
