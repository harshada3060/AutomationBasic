package Pack2;

import Pack1.publicMember;

public class AccessPublicMember2 {

	public static void main(String[] args) {
		publicMember p1 = new publicMember();
		System.out.println("Accessing public members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		}
}
class Demo{
	public static void main(String[] args) {

		publicMember p1 = new publicMember();
		System.out.println("Accessing public members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
