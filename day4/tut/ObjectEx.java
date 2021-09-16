package day4.tut;

import java.util.Arrays;
import java.util.HashSet;

class SomeClass{}

public class ObjectEx {

	public static void main(String[] args) {
	
		SomeClass obj = new SomeClass();
		System.out.println(obj.toString());
		System.out.println(obj);
		System.out.println(Integer.toHexString(obj.hashCode()));
		System.out.println(obj.getClass().getName());
		
		String s =Arrays.toString(new Integer[] {1,2,3,4,5});
		System.out.println(s);
		
		
	}

}
