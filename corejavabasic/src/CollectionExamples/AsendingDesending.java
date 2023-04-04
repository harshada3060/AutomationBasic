package CollectionExamples;

import java.util.ArrayList;
import java.util.Collections;

public class AsendingDesending {
	
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(12);
	list.add(3);
	list.add(1);
	list.add(4);
	list.add(2);
	list.add(5);
	
	System.out.println("original Array list:"+list);
	
	Collections.sort(list);
	
	System.out.println("Asending order list:"+list);
	
	Collections.reverse(list);
	
	System.out.println("Desending order list:"+list);
	
	
}
}
