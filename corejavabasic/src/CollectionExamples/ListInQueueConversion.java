package CollectionExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


public class ListInQueueConversion {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
	  Queue<Integer> q = new PriorityQueue<Integer>(list);
		System.out.println(q);
	}

}
