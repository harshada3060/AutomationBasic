package This_keyword;

public class ThisKeyword4 {
	int age;

	void call() {
		System.out.println("I am call method");
	}

	void m(int age) {
		System.out.println("local age:" + age);
		System.out.println("Gloval age:" + this.age);
		// call();or
		this.call();
		System.out.println("This keyword value is:" + this);// print same referance ID
	}

	public static void main(String[] args) {
		ThisKeyword4 obj = new ThisKeyword4();
		System.out.println("object obj value is:" + obj);// prints the referance ID
		obj.m(25);

	}

}
//relation between object and this keyword.... shows here i.e object=this keyword