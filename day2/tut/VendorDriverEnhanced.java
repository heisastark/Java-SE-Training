package day2.tut;

public class VendorDriverEnhanced {

	public static void main(String[] args) {
		Vendor v1= new Vendor();
		Vendor v2= new Vendor();
		Vendor v3= new Vendor();
		
		
		v1.name= "Oracle";
		v1.id= 89667;
		v1.GSTNo= "HKF857598HLKK";
		
		v2.name= "IBM";
		v2.id= 90667;
		v2.GSTNo= "KK157598HLKK";
		
		v3.name= "Qualcom";
		v3.id= 12367;
		v3.GSTNo= "THY997598HLKK";
		

		// Type arrayNae[] = {value1,value2..}
		
		Vendor vendorList[] = {v1,v2,v3}; // Array of Vendor Objects
		
		for(Vendor v : vendorList) {
			System.out.println("\nVendor Details \n===============");
			System.out.println(v.name);
			System.out.println(v.id);
			System.out.println(v.GSTNo);
		}
			
		
		

	}

}
