package day3.tut;

class Values{
	
	public Values() {
		System.out.println("NO- VALUES");
	}
	
	public Values(String value1) {
		System.out.println(value1);
	}
	
	public Values(String value1, String value2) {
		System.out.println(value1 + "\t" + value2);
	}
	
	public Values(int i, String value1) {
		System.out.println(i + "\t" +value1);
	}
	
	
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Values v1 = new Values();
		
		Values v2 = new Values("Hello");
		
		Values v3 = new Values("Hello","Welcome");
		
		Values v4 = new Values(10,"Welcome");

	}

}
