package day1.tut;

public class LogicalOprEx {

	public static void main(String[] args) {
		
		int i= 550;
		if(i>500){
			if(i<600){
				System.out.println("Its with range 500 -600");
			}
		}

	//	(or)

		if(i>500 & i<600)
			System.out.println("Its with range 500 -600");

		if(i>500 && i<600) // short circuit and opr --> evaluates LHS Exp (i>00)==> false, never evaluate RHS (i<600)
			System.out.println("Its with range 500 -600");
		if(i>500 || i<600) // short circuit or opr --> evaluates LHS Exp (i>00)==> true, never evaluate RHS (i<600)
			System.out.println("Its with range 500 -600");
	
	}

}
