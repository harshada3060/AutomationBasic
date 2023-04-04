package Intrefaceexamples;

public interface DemoInterface {
	void display();// java compiler will convert this into ---> public abstract void display();
}
class Demo13 implements DemoInterface {
   public void display() {
		System.out.println("hello");
	}
 public static void main(String[] args) {
		Demo13 d1 = new Demo13();
		d1.display();
	}
}