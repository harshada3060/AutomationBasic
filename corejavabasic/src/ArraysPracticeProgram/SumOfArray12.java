package ArraysPracticeProgram;

public class SumOfArray12 {
public static void main(String[] args) {
	int[] num = {2,4,5,6,7,-2,-6,8,9,4};
	double sum=0;
	
	for(int number:num) {
		sum= sum+number;
	}
	System.out.println("sum: " +sum);
  }
}
