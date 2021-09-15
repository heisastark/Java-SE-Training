package day2.tut;

public class forEx { //main class--.1 class with 1 main method -public static void main(String[] args) 

	/*
	 * Ex:-- try for loop to access the elements of a string array 

Ex: Excepted output
Test Server : 0
Test Server : 1
Test Server : 2
Test Server : 3
Test Server : 4
	 */
	
	public static void main(String[] args) {

		System.out.println("Enhanced for loop");
		for(Integer i: new Integer[] {0,1,2,3,4})
			System.out.println("Test Server : " +i);
		
	
		System.out.println("For loop");
		for(int i=0; i< 5; i++)
			System.out.println("Test Server : "+i);
	
		System.out.println("While Loop");
		int i=0;
		while(i<=4) {
			System.out.println("Test Server : "+ i);
			i++;
		}
		
		System.out.println("Do-While Loop");
		i=0;
		do {
			System.out.println("Test Server : "+ i);
			i++;
		}while(i<=4);
	
	}


}

// file name match with main classname
// class with public is the main class
// main class contains main method
class WhileEx{
	
}
class WhileEx2{
	
}