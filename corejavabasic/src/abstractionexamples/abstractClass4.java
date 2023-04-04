package abstractionexamples;

abstract class RBIBank102 {
	final abstract double getRateOfInterestForHomeLoan();
}
class SBI102 extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}
class abstractClass4 {
	public static void main(String args[]) {		
	
	}
}
//we can not override final method thats y the error occour
//for abstract the overriden is mandatory bcoz abstract method has no body