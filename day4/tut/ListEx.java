package day4.tut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListEx {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		// List<Integer> list = new ArrayList<>(); valid
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
	//	list.forEach(x-> System.out.println(x));  // list element traversal
		

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(60);
		list1.add(70);
		list1.add(80);
		
//		list.addAll(list1);
//		System.out.println(list);
		
		list.addAll(1, list1);
		System.out.println(list);  // list.toString()
  		///Arrays
		
		Integer array[]= {1,2,3,4};
		
		List al = Arrays.asList(array);
		
		ListIterator iter = al.listIterator();  // 
		while(iter.hasNext())
			System.out.println(iter.next());
		
	//	al.add(100); // UnsupportedOperationException
		
		List al2 = new ArrayList(Arrays.asList(array)); 
		
		al2.add(9000);
		
		System.out.println(al2);
		
	}

}
