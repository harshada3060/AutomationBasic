package TotalRecall;

class primitive {
	public void a(double d) {
		System.out.println("value in decimal...");
	}

	void a(int i) {
		System.out.println("value in int ...");
	}
}

public class TypeCastingExample2 {
	public static void main(String[] args) {
		primitive p = new primitive();
		p.a(8);
		p.a(8.9);

	}

}
