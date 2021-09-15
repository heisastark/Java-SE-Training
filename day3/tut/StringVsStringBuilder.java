package day3.tut;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		
/*		
		StringBuilder value = new StringBuilder();
		
		System.out.println(value.capacity());
		
		value.append("We");
		
		System.out.println(value);
		
		value.append(" are ");
		
		System.out.println(value);
		
		value.append(" from the beautiful planet EARTH ");
		
		System.out.println(value.append(10));
		
		System.out.println(value);
		
		System.out.println("The no. of characters in sb" + value.length());
		
		
		System.out.println("Capcity: " +value.capacity());
	*/	
		
		StringBuilder value1 = new StringBuilder();
		
		value1.append("abcdefghtyuiopmnr");
		
		System.out.println(value1.capacity() + "\t " + value1.length());
		
	//	String s= new String("Original ");
		
	//	s= s.concat("We");
		
	//	System.out.println(s);
	}

}
