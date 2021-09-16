package day4.tut;

import java.util.HashSet;

public class hashsetEx {

	public static void main(String[] args) {

		HashSet hsSet= new HashSet();
		hsSet.add(1);
		hsSet.add(2);
		hsSet.add(1); //repeated value
		hsSet.add(3);
		hsSet.add(5);
		System.out.println(hsSet);// unique elements
		
		//******************************************
		
		Emp e1 = new Emp("theeba",11);
		Emp e2 = new Emp("theebakartik",11);

		System.out.println(e1.equals(e2));
		
		HashSet hs= new HashSet();
		hs.add(e1);
		hs.add(e2);
		
		System.out.println(hs);
	}

}
