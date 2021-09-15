package day2.tut;
class Vendor{ // package - specific/ default scope---> class can be accessed only with same pkg
	String name;
	Integer id;
	String GSTNo;
	
	void display() {
		System.out.println("\nVendor Details \n===============");
		System.out.println(name);
		System.out.println(id);
		System.out.println(GSTNo);
	}
	
	void viewAll(Vendor[] vendorList) {
		for (Vendor v : vendorList) {
			System.out.println("\nVendor Details \n===============");
			System.out.println(v.name);
			System.out.println(v.id);
			System.out.println(v.GSTNo);
		}
		
	}
}
public class VendorEx {

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
		
		System.out.println("\nVendor Details \n===============");
		System.out.println(v1.name);
		System.out.println(v1.id);
		System.out.println(v1.GSTNo);
		
		System.out.println("\nVendor Details \n===============");
		System.out.println(v2.name);
		System.out.println(v2.id);
		System.out.println(v2.GSTNo);
		
		System.out.println("\nVendor Details \n===============");
		System.out.println(v3.name);
		System.out.println(v3.id);
		System.out.println(v3.GSTNo);
		
		// array of Vendor Object
		// use array with enhanced for loop
	}

}
