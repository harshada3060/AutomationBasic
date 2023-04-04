package Typecasting;
class Member{
	//member variable of this class
	long phone;
	//member function of this class
	void chat() {
		System.out.println("chatting in whats up group with :"+phone);
	}
}
class Admin extends Member{
	void addNumber() {
		System.out.println("adding a new  user number in whatsapp group ");
	}
}
public class UpCasting3 {
     public static void main(String[] args) {
		//crating object of Admin
    	 Member mem = new Admin();
    	 mem.phone = 788746;
    	 //calling function
    	 mem.chat();
    	 System.out.println("********After dowmcasting****");
         Admin ad = (Admin)mem;//----Admin ad = (Admin) new Admin();
         ad.addNumber();
         ad.chat();
         System.out.println(ad.phone);
       //  Admin a1 = new Member();//direct downcasting ,invalid or not possible

	}
}
