package Pack1;

public class privateMember {
	private int accNum = 12345;

	private void displayAccNum() {
		System.out.println("Account Number:" + accNum);
	}

	public static void main(String[] args) {
		privateMember p1 = new privateMember();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}

class AccessprivateMember2 {
	public static void main(String[] args) {
		privateMember p1 = new privateMember();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}

/*
 * private members are accesible with in a class only
 */
//here we create second class is not accse private member