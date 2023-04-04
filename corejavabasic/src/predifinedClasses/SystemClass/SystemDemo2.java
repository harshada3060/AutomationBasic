package predifinedClasses.SystemClass;

class training{
	training(){
		System.out.println("Training class const");
	}
	void manualTesting() {
		System.out.println("I am from manual Testing");
	}
	void automationTesting() {
		System.out.println("I am from Automation Testing");
	}
}
public  final class SystemDemo2 {
	//static object creation
    static  training t1 = new training();
    
	public static void main(String[] args) {
		System.out.println("program starts..");
		
		SystemDemo2 .t1.manualTesting();
		SystemDemo2.t1.automationTesting();
		
		//classname.staticRefVar.method
	
		//non static reference variable
		training t2 = new training();
		t2.manualTesting();
		t2.automationTesting();
		System.out.println("program ends ..");
		
		 //classname.staticRefVar.method
		
		System.err.println("I am error, From SystemDemo2 class");
	}

}
