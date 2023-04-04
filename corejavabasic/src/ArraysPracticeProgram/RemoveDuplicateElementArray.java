package ArraysPracticeProgram;

public class RemoveDuplicateElementArray {
    public static void main(String[] args) {
		int[] arr= {4,2,2,2,5,6,4,3,5,7,9};
		
		for(int i=0;i<arr.length;i++) 
			System.out.println("\t"+arr[i]);
		
        for(int i=0;i<arr.length;i++) {
        	
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]==arr[j]) {
        			arr[i]=-1;
        		}
        	}
        }
        System.out.println("Remove Array is:");
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]!=-1) {
        		System.out.println("\t"+arr[i]);
        	}
        }
	}

}
