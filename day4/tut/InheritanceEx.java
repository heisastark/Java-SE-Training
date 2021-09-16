package day4.tut;
class Parent{
	int i=10;
	
	void m1() {
		System.out.println("Parent class method");
	}
}

class Child extends Parent{
	int j=400;

	void m1() {
		System.out.println("Child class method");
	}
	
	void some() {
		super.m1();  // parent behavior   // method override
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		
		Child obj = new Child();
		System.out.println(obj.j);
		
		System.out.println(obj.i);
		
		obj.m1();
		
		obj.some();
		
		new Parent().m1();
		

	}

}
