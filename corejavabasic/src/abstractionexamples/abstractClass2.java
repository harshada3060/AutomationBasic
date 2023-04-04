package abstractionexamples;

abstract class shape {
	abstract void draw();
}

//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends shape {
	protected void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends shape {
	public void draw() {
		System.out.println("Drawing circle");
	}
}

//In real scenario, method is called by programmer or user
public class abstractClass2 {
	public static void main(String[] args) {
		shape s = new Circle();
		s.draw();
		shape s1 = new Rectangle();
		s1.draw();
	}
}
