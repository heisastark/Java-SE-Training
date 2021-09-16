package day4.tut;
class P1{
	String familyName= "BOB";
}

class C1 extends P1{
	String schoolName;
}


public class TypecastEx {

	public static void main(String[] args) {


		C1 cobj = new C1();   // all features both
		
		System.out.println(cobj);
		cobj.schoolName = "ZZZZ";
		//cobj.familyName
		//cobj.SchoolName
		

//		P1 pobj1 = new P1();   // only parent members
		
		//pobj1.familyName
  //      P1 pobj2 = new C1();  // down casting    // Parent pobj2 = (Parent) new Child();
		// restrict the acesss of child members
		
       //  pobj2.familyName
        
        
       C1 cobj2= (C1) new P1();  // upcasting --> casting done explicitly
        
       //  cobj2.familyName;
       //  cobj2.schoolName;
        
        P1 pobj3 = cobj;  // down casting
        
         C1 cobj3 = (C1) pobj3; // Upcast
         System.out.println(cobj3.schoolName);
         System.out.println(cobj3);    // ===> cobj3.toString()
         System.out.println(cobj3.schoolName);
         
         
        
	}

}
