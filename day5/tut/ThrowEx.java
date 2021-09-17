package day5.tut;

public class ThrowEx {

	public static void main(String[] args) throws Exception {
	
		m2();  // rethrowing an exception

	}
	
	static void m1() throws Exception {
		System.out.println("M1");
		throw new Exception("Example Exception"); // exception created
		
	}
	
	static void  m2() throws Exception {
		m1();
	}

}
