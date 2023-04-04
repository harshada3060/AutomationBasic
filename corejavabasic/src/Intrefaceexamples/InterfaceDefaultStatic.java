package Intrefaceexamples;

interface Drawable2 {
	void draw();

	default void msg() {
		System.out.println("default method");
	}

	static int cube(int x) {
		return x * x * x;
	}
//	default static int print() {//default static can't be written together
//		System.out.println("default static of interface ");
//	}
//	private methods are allow in jdk9
//	private void test() {
//		System.out.println("private method");
//	}
}

class Rectangle2 implements Drawable2 {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class InterfaceDefaultStatic {
	public static void main(String[] args) {
		Drawable2 d = new Rectangle2();
		d.draw();
		d.msg();
      System.out.println(Drawable2.cube(3));
	}

}
/**
from Jdk8: in interface we have complete/non-abstarct method also but
those methods should be declare with default or static
*/
