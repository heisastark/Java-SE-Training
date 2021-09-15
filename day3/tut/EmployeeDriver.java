package day3.tut;

class Employee{
	
	String ename;
	int eid;
	String city;
	
	public Employee(String ename, int eid, String city) {
		this.ename = ename;
		this.eid = eid;
		this.city = city;
	}
	
	//create a method display() that prints a specific employee details.
	
	void display() {
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("=================");
		System.out.println("NAME : " + this.ename);
		System.out.println("NAME : " + this.eid);
		System.out.println("NAME : " + this.city);
		
		System.out.println("******************************************************");
	}
	
	//create display() that prints all the employees details
	//			------------------pass an employee array
	
	void display(Employee[] empArray) {
		
		System.out.println("EMPLOYEE DETAILS FOR "+ empArray.length + " EMPLOYEES");
		System.out.println("=======================================");
		
		for(Employee emp: empArray) {
			System.out.println("NAME : " + emp.ename);
			System.out.println("NAME : " + emp.eid);
			System.out.println("NAME : " + emp.city);
			System.out.println("=================");
		}
		System.out.println("******************************************************");
	}
	
	//create display() that prints all the employees details
	//--------------------------------passing individual employee objects
	void display(Employee emp1, Employee emp2, Employee emp3) {
		
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("=================");
		System.out.println("NAME : " + emp1.ename);
		System.out.println("NAME : " + emp1.eid);
		System.out.println("NAME : " + emp1.city);
		System.out.println("=================");
		
		
		System.out.println("NAME : " + emp2.ename);
		System.out.println("NAME : " + emp2.eid);
		System.out.println("NAME : " + emp2.city);
		System.out.println("=================");

		System.out.println("NAME : " + emp3.ename);
		System.out.println("NAME : " + emp3.eid);
		System.out.println("NAME : " + emp3.city);
		System.out.println("=================");
		
		System.out.println("******************************************************");
	}
	
}

public class EmployeeDriver {

	public static void main(String[] args) {
	
		Employee e1 = new Employee("Kashyap", 101,"Pune");
		Employee e2 = new Employee("kaurav", 102,"Mumbai");
		Employee e3 = new Employee("Sam", 101,"Hyderabad");
		
		e1.display();//no arg
		
		e1.display(new Employee[] {e1,e2,e3}); // single arg- Employee array
		
		e1.display(e1, e2, e3); // 3 args- employee
		
	}

}
