package Pack1;

public class protectedMember {
     protected int accNum=12345;
     protected void displayAccNum() {
    	 System.out.println("Account Number:"+accNum);
     }
	public static void main(String[] args) {
		protectedMember p1 = new protectedMember();
         System.out.println(p1.accNum);
         p1.displayAccNum();
	}

}
class AccessprotectedMember {
	public static void main(String[] args) {
			protectedMember p1 = new protectedMember();
	         System.out.println(p1.accNum);
	         p1.displayAccNum();
		}

	}
/**
 * protected members are accessible with in package 
 * but can be access these member from outside the package using inheritance
 */
