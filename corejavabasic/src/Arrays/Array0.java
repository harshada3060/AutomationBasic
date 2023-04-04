package Arrays;

public class Array0 {
	public static void main(String[] args) {
		// String[] cars;
		// cars = new String[4];
		// or
//		String[] cars= new String[4];
//		cars[0]="VOLVO";
//		cars[1]="BMW";
//	    cars[2]="Ford";
//	    cars[3]="Mazda";

		// or
		String[] cars = { "VOLVO", "BMW", "Ford", "Mazda" };
		// Access the Elements of an Array
		System.out.println(cars[0]);// Volvo
		// Change an Array Element
		cars[0] = "Opel";
		System.out.println(cars[0]);// opel
		// array element count
		System.out.println(cars.length);// 4
		System.out.println("*********Normal for-loop***********");
		// iterate array elements using for loop
		for (int i = 0; i < cars.length; i++) {// opel,bmw,ford,mazda---->here we change volvo  to opel
			System.out.println(cars[i]);
		}
		System.out.println("**************for-each loop*******************");
		// iterate array elements using for-each loop
		for (String i : cars) {
			System.out.println(i);
		}
	}

}
