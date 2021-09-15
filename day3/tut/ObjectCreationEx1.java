package day3.tut;

public class ObjectCreationEx1 {

	public static void main(String[] args) {
	
		A obj1 = new A(); // unreferenced obj
		
		A obj2 = new A();
		
		obj1= obj2;
		
		//=====================
		
		A obj3 = new A();  // unreferenced obj
		
		obj3 = null;
		

	}

}
