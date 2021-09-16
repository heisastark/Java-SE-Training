package day4.tut;
interface MyInterface2{
	default void m2() {
		System.out.println("Theeba");
	}
}

public class InterfaceImpleEx implements MyInterface, MyInterface2{

	public static void main(String[] args) {
	
		
		InterfaceImpleEx obj = new InterfaceImpleEx();
		
		obj.m1();
		
		obj.m2(); // default method call
		
		MyInterface.m3(); //static method call
	}

	@Override
	public void m1() {
		
		System.out.println("Interface Implementation");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
	//	MyInterface2.super.m2();
		MyInterface.super.m2();
	}

}
