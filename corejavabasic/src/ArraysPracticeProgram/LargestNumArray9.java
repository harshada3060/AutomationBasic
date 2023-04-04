package ArraysPracticeProgram;
class sample{
	static void max(int arr[]) {
	int max = arr[0];
	for(int i=1;i<arr.length;i++) {
		if( max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println("print maximum number in array: "+max);
  }
}
public class LargestNumArray9 {
  public static void main(String[] args) {
		int [] arr = { 2,4,6,8,33,58,78};
		sample.max(arr);
		}
}
