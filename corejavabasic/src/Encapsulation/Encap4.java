package Encapsulation;

class Account {
	// private data members
	private long acc_no;
	private float amount;

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}

public class Encap4 {
	public static void main(String[] args) {
		// creating instance of Account class
		Account acc = new Account();
		// getting value through getter method
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getAmount());
		// setting value through setter method
		acc.setAcc_no(750067532L);
		acc.setAmount(500000f);
		// getting value through getter method
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getAmount());
		System.out.println("************************************");
		Account acc2 = new Account();
		System.out.println("Account  number using new object: " + acc2.getAcc_no());
		System.out.println("Amount using new Object: " + acc2.getAmount());
	}

}
