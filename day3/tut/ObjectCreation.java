package day3.tut;


class A{
	int i; // instance var
}


public class ObjectCreation {

	public static void main(String[] args) {
		
		A obj1 = new A(); // Constructor call
		
		System.out.println(obj1);
		// fullyqualified classname @ alphanum
		// packageName.ClassName @ hashcode
		
		A obj2 = obj1; // resusing an already existing obj
		
		System.out.println(obj2);
		
		obj2.i=100;
		
		System.out.println(obj1.i);
		
		System.out.println(new A());
		
		obj2= new A();
		
		/*
		 * obj1-----> same obj
		 * 
		 * obj2----> new obj
		 * 
		 * 
		 */
		
		/* To create a new obj from an already existing obj
		 * 1.constructor
		 * 2.clone()---> Object
		 */
		
	}

}
