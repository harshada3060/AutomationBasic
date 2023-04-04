package predifinedClasses.StringClass;

public class CompareToString {

	public static void main(String[] args) {
		String s1 = "Deccan";
		String s2 = "Deccan";
		String s3 = "Viman";
		String s4 = "Erandol";
		String s5 = "Ahamd";
		
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));
	}

}
//it compares differ between D to A i.e =3,s1&s2 same then value is 0