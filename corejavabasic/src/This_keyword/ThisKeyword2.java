package This_keyword;

public class ThisKeyword2 {
	int x;

//constructor with parameter
	public ThisKeyword2(int x) {
		this.x = x;
	}

//call the constructor
	public static void main(String[] args) {
		ThisKeyword2 myobj = new ThisKeyword2(5);
		System.out.println("value of X:" + myobj.x);
	}

}
