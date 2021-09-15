package day1.tut;

import java.util.Scanner;// import packagename.Classname;
// java.lang --> System
public class StringEx {

	public static void main(String[] args) {
	/*	
		String s1= new String("Hello");
		String s2= new String("Hello");
		
		System.out.println(s1==s2);  // equality-- returns T/F
		
		int i=10;
		int j=10;
		System.out.println(i==j);
		
		System.out.println(s1.equals(s2));// equals--> Object class
		System.out.println(+0.0/-0.0);
		
		System.out.println(s1+s2);  // String concatenation operator
		
		System.out.println(s1+10);// s1+ "10" ==> Hello10
		
		
		 
		  Ex: 
		  create two variables lname and fname.
		  create a var name but dont initiaize;
		  using String string concatenation opr, assign var name
		  display name to console
		
		 
		
		String lName= "Karthik";
		String fName= "Theeba";
		
		String name;
		
		name=fName + lName;
		
		System.out.println(name);
		
		// read from console
	*/	
		Scanner obj = new Scanner(System.in);
		
		//String input= obj.next();
		
		//System.out.println("The input is "+input);
		
	//	String lName= obj.next();
	//	String fName= obj.next();
		
		String name;
		name=obj.nextLine();
	//	name=fName + lName;
		
		System.out.println(name);
		
		
	}

}
