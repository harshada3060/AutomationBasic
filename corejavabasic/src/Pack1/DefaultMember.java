package Pack1;

public class DefaultMember {
	int accNum = 12345;
     void displayAccNum() {
		System.out.println("Account Number:" + accNum);
	}
 public static void main(String[] args) {
		DefaultMember p1 = new DefaultMember();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
class AccessDefaultMember {
	public static void main(String[] args) {
		DefaultMember p1 = new DefaultMember();
		System.out.println(p1.accNum);
		p1.displayAccNum();
		DefaultMember p2 = new DefaultMember();
		System.out.println(p2.accNum);
		p2.displayAccNum();
		
	}
}
/**
 * default members are accessible with in package
 */