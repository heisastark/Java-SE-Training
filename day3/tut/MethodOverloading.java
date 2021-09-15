package day3.tut;

class A1{

	//1st method
		void m1(){
			//display one
			System.out.println("ONE");
		}
	//2nd method	
		void m1(String s){ // method signature
			// display s
			System.out.println(s);
		}
	//3rd method	
		void m1(String s, int i){
			// displays s , i
			System.out.println(s + "\t" + i);
		}
		
	// 4th method
		void m1(int i, String s){
			// displays s , i
			System.out.println(s + "\t" + i);
		}
		/* error- not method overloading
		void m1(String s1, int i1){
			// displays s , i
			System.out.println(s + "\t" + i);
		}
		*/
	} 

public class MethodOverloading {

	public static void main(String[] args) {

		A1 obj = new A1();
		
		obj.m1();
		
		obj.m1("Welcome"); // method call
		
		obj.m1("Hello", 101);

	}

}
