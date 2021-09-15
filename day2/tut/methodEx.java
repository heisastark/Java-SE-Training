package day2.tut;
class Student{
	
	String name;
	int sid;
	
	/*
	 * scope returunType methodName(parametrs){

	statements
		}
	 */
	
	//default/ package-specific- didn't specify scope
	
	void display() {  // method Definition
		System.out.println("\nSTUDENT DETAILS\n============");
		System.out.println("Student Name : " + name);
		System.out.println("Student ID : " + sid);
	}
	                   //   Shalini
	void updateName(String ename) { // method accepts 1 arg
		name=ename;
	}
	
	String getUpdatedName() { // method that returns a value
		return name;
	}
	
}
public class methodEx {

	public static void main(String[] args) {
	
		
		//objectName.methodName(values);
		System.out.println("Main method Begins");
		Student obj = new Student();
		obj.name="Theeba";
		obj.sid=101;
		
		obj.display();// method call  //==> display(obj);
		
		obj.updateName("Shalini");
		
		System.out.println("The Updated Name is : " + obj.getUpdatedName());
		System.out.println("Main Methd Ends");
	}

}
