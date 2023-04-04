package ArraysPracticeProgram;

public class LargestNumberArray {

	public static void main(String[] args) {
		int temp;
		int[] array = {47,1,2,78,10,20,0,25,63,96,57,100};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println(" largest number is:"+array[array.length-1]);
		
	   }

	}


