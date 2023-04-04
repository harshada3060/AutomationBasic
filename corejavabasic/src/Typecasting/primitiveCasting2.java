package Typecasting;

public class primitiveCasting2 {

	public static void main(String[] args) {
		int Salary = 30000;// ----->int to double ,float here widening
		double SalaryDouble = (double) Salary;
		float Salaryfloat = (float) Salary;
		System.out.println("***********explicit widening**********");
		System.out.println("salary:" + Salary + "\n salaryDouble:" + SalaryDouble + "\nsalaryFloat:" + Salaryfloat);
		System.out.println("***********implicit widening**********");
		/* implicit widening or auto-widening */
		double SalaryDouble2 = Salary;
		float SalaryFloat2 = Salary;
		System.out.println("salary:" + Salary + "\n salaryDouble2:" + SalaryDouble2 + "\nsalaryFloat2:" + SalaryFloat2);

		double SalaryDb = 30000.35d;
		/* explicit narrowing */
		int SalaryInt = (int) SalaryDb;
		float SalaryFt = (float) SalaryDb;
		System.out.println("*********explicit narrowing***********");
		System.out.println("salaryDb: " + SalaryDb + "\nsalaryInt: " + SalaryInt + "\nsalartFt :" + SalaryFt);

		// /*implicit narrowing not possible*/---->narrowing is only possible in
		// explicit
		// int salaryInt2=salaryDb;
		// float salartFt2=salaryDb;
	}

}
