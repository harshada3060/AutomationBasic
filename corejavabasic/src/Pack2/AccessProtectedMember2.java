package Pack2;

import Pack1.protectedMember;

public class AccessProtectedMember2 extends protectedMember {

	public static void main(String[] args) {
		AccessProtectedMember2 p1 = new AccessProtectedMember2() ;
		System.out.println("Accessing protected member from another class outside of package ");
	    System.out.println(p1.accNum);
         p1.displayAccNum();
     }
}
class TestProtectedMember extends AccessProtectedMember2{
	public static void main(String[] args) {
		AccessProtectedMember2 p1 = new AccessProtectedMember2();
		// you will not be allowed to access parent most class ProtectedMembers members
				// here
		//System.out.println(p1.accNum);
		//p1.displayAccNum();
		TestProtectedMember t1 = new TestProtectedMember();
		// to overcome this you can create an object of child most class
		System.out.println(t1.accNum);
		t1.displayAccNum();
	}
}
/*
 * using inheritance we can access protected members from outside the package
 */