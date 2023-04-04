package method_nonstatic;

public class Ascii_by_non_static {

	public static void main(String[] args) {
		Ascii_by_non_static a = new Ascii_by_non_static();
		System.out.println("ascii value of d:" + a.getascii('s'));
	}

	int getascii(char c) {
		return c;
	}
}
