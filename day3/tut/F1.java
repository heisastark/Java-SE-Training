package day3.tut;

class F1{

	public static void main(String[] args) {
	
		System.out.println("Welcome here");

		for(String e: args)
			System.out.println(e);
		
		Student obj = new Student("Hari",111,"Prod");
		
		System.out.println(obj.dept);
		
	}

}
// Greet.main()
// F1.main()
// filename as main classname