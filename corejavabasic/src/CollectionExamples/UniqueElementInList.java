package CollectionExamples;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueElementInList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(5);
      
        System.out.println("Original Array:"+list);
        HashSet<Integer> set =  new HashSet<Integer>(list);
        
        System.out.println("Unique element :"+set);
	}

}
