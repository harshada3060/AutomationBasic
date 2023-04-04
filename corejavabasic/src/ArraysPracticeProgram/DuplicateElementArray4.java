package ArraysPracticeProgram;

public class DuplicateElementArray4 {

	public static void main(String[] args) {
		
		String arr[] = {"java","c","c++","python","java","c"};
		boolean temp =false;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
			System.out.println("Found Duplicate Element:"+arr[i]);
			temp=true;
				}
//				else{
//					System.out.println("Duplicate Element not Found");
//				}
			}
		}
		if(temp==false) {
			System.out.println("Duplicate element not found");
		}
	}

}
