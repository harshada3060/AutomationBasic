package Arrays;

class TestReturnArray {
	// creating method which returns an array
	static int[] getArray() {
		int num[] = new int[3];
		num[0] = 10;
		num[1] = 13;
		num[2] = 15;
		return num;// or
		// return new int[] {10,30,50,90,60};

	}
}

public class Array5 {
	public static void main(String[] args) {
		// calling method which returns an array
		int a[] = TestReturnArray.getArray();//=new int [];
		// printing the values of an array
		for (int i = 0; i < a.length; i++)// {i=0<3 =
			System.out.println(a[i]);// 10
		
		//TestReturnArray [] t1 = new TestReturnArray [3];
		//t1[0].getArray();
	}
}
