package day4.tut;

import java.util.function.Function;

/*
interface Calculation{
	int increment(int a);
} // functional i/f--> i/f with SAM   
class NamedClassImple implements Calculation{

	@Override
	public int increment(int a) {
		return ++a;
	}
	
}
*/

public class ExerciseOnInterface {

	public static void main(String[] args) {
	/*
		NamedClassImple obj1 = new NamedClassImple();
		
		System.out.println("Named Class Implementation");
		System.out.println(obj1.increment(10));
		
		//***************************************************8
		Calculation obj2 = new Calculation() {
			
			@Override
			public int increment(int a) {
				return ++a;
			}
		};
		
		System.out.println("Anonymous Class Implementation");
		System.out.println(obj2.increment(10));
		//*********************************************************
		
		Calculation obj3  = a -> ++a ; // valid expression
		
		System.out.println("Lambda Implementation");
		System.out.println(obj3.increment(10));
	
		*/
		//******************************************************
		
		// predefined functional interface 
		// java.util.function
		
		Function<Integer,Integer> obj4 = a -> ++a ; 
		
		System.out.println("Using Predefined Functional Interface");
		System.out.println(obj4.apply(10));
		
		
		
		
	//	(a)-> { System.out.println(a);return a++;}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
