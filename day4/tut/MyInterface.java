package day4.tut;

public interface MyInterface {

	int i=10; // public static final int i=10;
	
	void m1(); // abstract method
	
	default void m2() {
		System.out.println("hello");
		pp1();
	}
	
	static void m3() {
		System.out.println("Welcome");
		pp2();
	}
	
	private void pp1() {
		System.out.println("Private Method");
	}
	
	private static void pp2() {
		System.out.println("Private Method");
	}
}
