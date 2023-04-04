package Pack2;



public class AccessPublicMember3 {

	public static void main(String[] args) {
		//using fully qualified class name: packagename.classname
		Pack1.publicMember p1 = new Pack1. publicMember();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		
		Pack1.publicMember p2=new Pack1.publicMember();
		
	}

}
