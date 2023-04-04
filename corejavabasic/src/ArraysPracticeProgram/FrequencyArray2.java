package ArraysPracticeProgram;

public class FrequencyArray2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,2,2,3,1};
		// to store frequency of the array elements
		int fre[] = new int[arr.length];
		
		int visited = -1;
		for(int i=0;i<arr.length;i++) {
			
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fre[j]=visited;
				}
			}
			if (fre[i]!=visited) {
				fre[i]=count;
			}
		}
	System.out.println("*************************");
     for(int i=0;i<fre.length;i++) {
    	 if(fre[i]!=visited) {
    		 
 				System.out.println(arr[i]+" : "+fre[i]);
 			}
    	 }
     }
}
