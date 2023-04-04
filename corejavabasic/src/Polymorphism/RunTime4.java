package Polymorphism;

class Bank {
	float getRateOfIntrest() {
		return 0;
	}
}

class SBI extends Bank {
	float getRateOfIntrest() {
		return 8.4f;
	}
}

class ICICI extends Bank {
	float getRateOfIntrest() {
		return 7.3f;
	}
}

class Axis extends Bank {
	float getRateOfIntrest() {
		return 9.7f;
	}
}

public class RunTime4 {

	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("SBI Rate Of Intrest:" + b.getRateOfIntrest());
		b = new ICICI();
		System.out.println("ICICI Rate of Intrest:" + b.getRateOfIntrest());
		b = new Axis();
		System.out.println("Axis Rate of Intrest:" + b.getRateOfIntrest());
	}

}
