package day2.tut;

public class StaticVarEx {

	Integer eno=10; // instance var
	
	static String dept="Training";
	
	public static void main(String[] args) {
	
		StaticVarEx o1 = new StaticVarEx();
		o1.eno=100;
		StaticVarEx.dept="Sales";// ClassName.staticvar //valid
		System.out.println(o1.eno);
		System.out.println(o1.dept);
		
		
		StaticVarEx o2 = new StaticVarEx();
		o2.eno=200;
		o2.dept="Production"; // valid- not recommended- 
		System.out.println(o2.eno);
		System.out.println(o2.dept);
		
		
		StaticVarEx o3 = new StaticVarEx();
		o3.eno=300;
		System.out.println(o3.eno);
		System.out.println(o3.dept);

	}

}
