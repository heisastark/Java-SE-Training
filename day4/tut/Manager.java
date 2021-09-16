package day4.tut;

import java.util.Objects;

class Person{
	
	String name;
	String city;
	
	public Person(String name, String city) {
		this.name = name;
		this.city = city;
	}
	
}


class Employee extends Person{
	int id; 
	String dept;
	
	public Employee(String name, int id, String dept, String city) {
		super(name,city);
		this.id = id;
		this.dept = dept;
	}
			
}// Multilevel inheritance

public class Manager extends Employee{

	Double salary; 
	public Manager(String name, int id, String dept, String city, Double salary) {
		super(name, id, dept, city);
		this.salary = salary;
	}
	
	
	public static void main(String[] args) {
		
		Manager obj = new Manager("Theeba",101, "Training", "Bengaluru",8492.00d);
		
		System.out.println(obj.name);
		System.out.println(obj.id);
		System.out.println(obj.dept);
		System.out.println(obj.city);
		System.out.println(obj.salary);

	}

}
