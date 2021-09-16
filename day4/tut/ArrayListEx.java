package day4.tut;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		List list = new ArrayList();  // interface  - raw type -->List<E>===> List<Object>
		
	//	ArrayList list = new ArrayList(); // interface + ArrayList class methods
		// allows duplicates
		list.add(10);
		list.add("Hello");
		list.add(20);
		list.add(20);
		
		// Object type
		System.out.println(list);// list.toString()
		
		System.out.println(list.get(0));
	//	System.out.println(list.get(0).getClass());
	//	System.out.println(list.getClass());
		
		
	}

}
