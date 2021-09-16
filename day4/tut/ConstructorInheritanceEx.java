package day4.tut;


class A1{
	int a;
	
	public A1(int a) {
		this.a =a;
	}
	
	void display() {
		System.out.println("Im A1 ");
	}
}


class A2 extends A1{
	int b;
	
	public A2(int a, int b) {
		super(a);  // parent constructor call   super()
		this.b = b;
	
	}
	
}


public class ConstructorInheritanceEx {

	public static void main(String[] args) {
	
		A2 obj = new A2(10,20);
		

	}

}
