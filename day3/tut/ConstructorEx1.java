package day3.tut;

class Human{
	String name;   // instance var- each obj
	int id;
	/*
	 * public Human(){
	 * name=null;
	 * id=0;
	 * }
	 */
		/*
	 * Scope classname(param){
	stmt
	stmt
}
	 */
	
	public Human() { // explicit constructor - non-parameterized constructor/ no-param / default
		name="Theeba";
		id=100;
		System.out.println("Welcome");
	}
	
	public Human(String n, int i) {
		name=n;
		id=i;
	}
}

public class ConstructorEx1 {

	public static void main(String[] args) {
	
	/*	Human obj = new Human(); // constructor call
			// jvm add a default constructor to your class
				System.out.println(obj.name);
		System.out.println(obj.id);
		
		//String s;
		//System.out.println(s);
	*/
		Human h1 = new Human("Vishnu", 101);
		
		Human h2 = new Human("Karthik", 102);
		
		System.out.println(h1.name + "\t" + h1.id);
		

		System.out.println(h2.name + "\t" + h2.id);
		
		/* Not necessary
		 * obj1.name="karthik"
		 * obj1.id=101
		 * 
		 * obj2.name="Vishnu";
		 * obj2.id=101
		 */
		
	}

}
