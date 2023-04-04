package abstractionexamples;

abstract class RBIBank {
	abstract double getRateOfIntrestForHomeLoan();

	final void loan() {
		System.out.println("As per RBI loan");
	}
}
class SBI101 extends RBIBank {
	double getRateOfIntrestForHomeLoan() {
		return 6.45;
	}
}
class PNB extends RBIBank {
	double getRateOfIntrestForHomeLoan() {
		return 7.5;
	}
}
public class abstractClass3 {
	public static void main(String[] args) {
		PNB p1 = new PNB();
		System.out.println("PNB Rate of interest is :" + p1.getRateOfIntrestForHomeLoan() + " %");
		p1.loan();
		SBI101 s1 = new SBI101();
		System.out.println("SBI rate of interest is :" + s1.getRateOfIntrestForHomeLoan() + " %");
		s1.loan();
		RBIBank b1 = new SBI101();
		System.out.println(
				"RBI reference but object of SBI, Rate of Interest is: " + b1.getRateOfIntrestForHomeLoan() + " %");
		RBIBank b2 = new PNB();
		System.out.println(
				"RBI reference but object of PNB, Rate of Interest is:" + b2.getRateOfIntrestForHomeLoan() + " %");

	}
}
