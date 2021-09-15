package day2.tut;

public class TernaryOpr {

	public static void main(String[] args) {
		int age=10;
		// (age<18)? System.out.println("Not Eligible") : System.out.println("Eligible"); 

		String eligibility = age<18? "Not Eligible" : "Eligible";
		
		System.out.println(eligibility) ;
		
	}

}
