package day4.tut;

public class AnonymousInnerClass {

	public static void main(String[] args) {
	
		
		MyInterface refVar = new MyInterface() {

			@Override
			public void m1() {
				System.out.println("Interface Implementation");
			}

		};
		
		refVar.m1();
		refVar.m2();
	}

}
