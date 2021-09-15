package day3.tut;

class A2{
	
	int id;
	public A2() {}
	public A2(A2 obj) { //Create Object from an already existing Object
		this.id =obj.id;
	}
}

public class ObjectCreateExistObj {

	public static void main(String[] args) {
		
		/*
		 * A2 obj1 = new A2(); obj1.id = 500;
		 * 
		 * A2 obj2 = new A2(obj1); System.out.println(obj2.id);
		 * 
		 * System.out.println(obj1==obj2 ? "Same Object" :"Differnt Object");
		 * 
		 * System.out.println("Obj1 : "+ obj1.id);
		 * 
		 * System.out.println("Obj2 : "+ obj2.id);
		 */
		
	//	main(new Integer[] {1,2,3,4});
		
	//	main("hello");
		
		
		for(String e: args) {
			System.out.println(e);
	//		System.out.println(e+10); //typecast str->Integer
			
		//	System.out.println(Integer.parseInt(e)+10);
		}
		
		for(int i=0; i<args.length; i++) {
			System.out.println(Integer.parseInt(args[i])+10);
		}
		
	}
	
	public static void main(Integer[] args) {
		System.out.println("Integer array args");
	}
	public static void main(String args) {
		System.out.println("Single String ");
	}

}
