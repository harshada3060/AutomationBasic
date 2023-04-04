package method;

public class ascii_by_static_method {

	public static void main(String[] args) {
		
		System.out.println(ascii('a'));
		ascii('A');
		System.out.println(ascii('b'));
		ascii('B');
	}

	static int ascii(char ch) {

		return ch;

	}
}
//if u want return value then write syso in the method body then we get return value