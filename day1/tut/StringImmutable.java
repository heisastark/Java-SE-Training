package day1.tut;

public class StringImmutable {

	public static void main(String[] args) {
	/*
		String s1= "Theeba";
		String s2= "Karthik";
		
		String s3= s1;
		
		s1= "Welcome "+ s2;
		
		System.out.println(s1==s3);
	*/
		
		// String Constant Pool
		
		String s= new String("hello");//outside scp , inside heap
		
		String s1= "Theeba"; // inside scp, inside heap
		
		String s2= "Theeba";
		
		String s4= new String("hello");
		
		String s5= new String("Theeba");
		
		System.out.println(s1 == s2);
		
		System.out.println(s == s4);
		
		System.out.println(s5 == s1); // equality opr checks ref 
		
		System.out.println(s5.equals(s1)); // equals checks value

	}

}
