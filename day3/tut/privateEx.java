package day3.tut;



class B{
	
	Student obj1 = new Student("Shalini", 101, "Training");
	
//	Student obj2 = new Student("Kayal", 1012, "Sales");
	
	Student m1() {
		return obj1;
	}

}
public class privateEx {

	public static void main(String[] args) {
	
		
		/*
		 * // System.out.println(obj.name); System.out.println(obj.getName());
		 *
		 * // System.out.println(obj.id); System.out.println(obj.getId()); // getter
		 * method--> retrieving value restricting updation to property
		 * 
		 * System.out.println(obj.dept);
		 * 
		 * obj.dept= "Sales";
		 * 
		 * System.out.println(obj.dept);
		 * 
		 * //obj.view();
		 */		
		
		
		B bObj = new B();
		
		Student x = bObj.m1();
		
		x.dept="Production";
		
	//	x.name= "Theeba"; // restricting updation
		
		x.setName("Theeba");
		
		System.out.println(x.getName());
		
		System.out.println(x.getId());
		
	}

}
