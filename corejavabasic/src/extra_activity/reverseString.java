package extra_activity;

public class reverseString {

	public static void main(String[] args) {
		String s = "Test";
		System.out.println(reverseString(s));

	}
	static String reverseString(String str) {
		String temp = " ";
		for (int i = str.length()-1 ; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}

}
