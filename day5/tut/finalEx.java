package day5.tut;


//final class A{  // restricts inheritance
class A{
	final int i=100; /// restricts variable to constant
	
	final void m2() {  // restricting method overriding
		System.out.println("Parent class method");
	}
}

class B extends A{
	int j=200;
/*	void m2() {
		System.out.println("Child class method");
	}*/
}


public class finalEx {

	public static void main(String[] args) {
		
	//	new B().i=500;
		new B().m2();
		
	}

}
