package day3.tut;

public class StringEx2 {

	public static void main(String[] args) {

		
		String s=new String("Hello");
		System.out.println("Before " + s.hashCode());// classnam@75hgh  --> obj rep
				// toString() implementation
		
	//	String s1=new String("We");
	//	System.out.println(s1.hashCode());
		
		s= "Hello"+ "Hai";
		
		System.out.println("After " + s.hashCode());
		

			StringBuilder sb = new StringBuilder("Hello");
			
			System.out.println("Before "  + sb.hashCode());
			
			sb.append("Hai");
			
			System.out.println("After " + sb.hashCode());
			
			// String--> username,password--> security
			// String Builder--> modifying value often- memory utilization
			// f1   f2   f3   f4   f5
			// l1   l2    l3   l1  l2
			// new file
			
			
			// StringBuffer  ---> multithreaded env
			//StringBuilder- single threaded env
	}

}
