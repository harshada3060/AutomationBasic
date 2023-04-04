package CollectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementList {
	
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("nisha");
	list.add("harshu");
	list.add("patil");
	list.add("kamble");
	list.add("patil");
	list.add("rupali");
	list.add("nisha");
	
	HashSet<String> set = new HashSet<String>(list);
	set.addAll(list);
	
	int totalDuplicate = list.size()-set.size();
	System.out.println(totalDuplicate);
	
	for(String m: set) {
		System.out.println(m+" :"+Collections.frequency(list, m));
	}
}
}
