package extra_activity;

class VariableType5 
{
	static int radius;//static global variable
	double area=25;//non-static global variable
	static double result;//static global variable
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		int x=25;//local variable
		VariableType5.radius=52;//initlization of static global variable
				//or
		//radius=52;
		System.out.println("Program Ends");
	}
}