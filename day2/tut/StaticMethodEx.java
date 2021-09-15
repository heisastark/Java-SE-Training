package day2.tut;


class A{

	static int i=100; // static var
	int j=200;   // instance var

	void m1(){ // instance method
		System.out.println(j);  // valid --> instance method can access both static method, static var, instance var 
		m2();
		System.out.println(i);
	}

	static void m2(){
		// static method accepts only static var, static method
		System.out.println(i); // always refer to static var
	//	m1(); // error
	//	System.out.println(j);// error
	}
}


public class StaticMethodEx {

	public static void main(String[] args) {
	
		A.m2();

	}

}
