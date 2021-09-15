package day2.tut;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		
	
		Scanner in = new Scanner(System .in);
		
		String osName[]= {"Linux","MacOs", "Win", "CentOs", "OL7"};
	//                      0      1       2        3        4 	
		System.out.println(osName[0]);
		System.out.println(osName[1]);
		System.out.println(osName[2]);
		System.out.println(osName[3]);
		System.out.println(osName[4]);
	//	System.out.println(osName[5]);// runtime ArrayIndexOutOfBoundException
		
		System.out.println("==============================");
		
		for(String elemnt : osName ) {  // traversing through the elements in  collection
			System.out.println(elemnt);
		}
		System.out.println("==============================");
		
		System.out.println("Enter 5 names");
		
		// 		Type arrayName[] = new Type[Size];
		String names[]= new String[10];  // Array Instantiation
		
		names[0]= in.next();
		names[1]= in.next();
		names[2]= in.next();
		names[3]= in.next();
		names[4]= in.next();
		
		for(String elemnt : names ) {  // traversing through the elements in  collection
			System.out.println(elemnt);
		}
		System.out.println("==============================");
		
		// Ex - create an int array with 101,102,103,104,105
		// display int array content
		
		Integer nos[]= {101,102,103,104,105};
		
		for( Integer n : nos)
			System.out.println(n);
		
		System.out.println("==============================");
		
		System.out.println(nos[0]);
		System.out.println(nos[1]);
		System.out.println(nos[2]);
		System.out.println(nos[3]);
		System.out.println(nos[4]);
		
		String s=null; // requires an explicit initialization
		System.out.println(s);
	}

}
