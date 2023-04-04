package TotalRecall;

class chicken{
	void  eat() {
		System.out.println("yummy");
	}
}
class Lollipop extends chicken{
	void eat() {
		System.out.println("Mouth Watering");
	}
	void crunchy() {
		System.out.println("It's crunchy...");
	}
}
class Tandoori extends chicken{
	void eat() {
		System.out.println("Deliciouse");
	}
	void smoky() {
		System.out.println("Rosted Well");
	}
}
public class RuntimePoly {
	public static void main(String[] args) {
		Tandoori t =  new Tandoori();
		t.eat();
		t.smoky();
		
		System.out.println("***************");
		
       Lollipop l = new Lollipop ();
         l.crunchy();
         l.eat();
       
       System.out.println("******************");
       
       chicken c = new chicken();
       c.eat();
       
       System.out.println("**********************");
       
      chicken c1 = new Lollipop();
       c1.eat();
       
     System.out.println("*********************");
     
      chicken c2 = new Tandoori();
       c2.eat();
       
     System.out.println("***********************");
     chicken c3 = t;
     t.eat();
    		 
	}

}
