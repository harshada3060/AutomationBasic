package Pack1;

public class publicMember {
	public int accNum = 12345;

	public void displayAccNum() {
		System.out.println("Account number:" + accNum);
	}
    public static void main(String[] args) {
		publicMember p1 = new publicMember();
		System.out.println(p1.accNum);
		p1.displayAccNum();

	}

}
class AccesspublicMember {
   public static void main(String[] args) {
		publicMember p1 = new publicMember();
		System.out.println("Accessing public members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
 * public members are accessible from any where like- with in same class from
 * outside the class from outside the package but that class should be declared
 * as public
 */