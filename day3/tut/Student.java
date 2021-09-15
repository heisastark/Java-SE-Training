package day3.tut;

public class Student{
	
	private String name; // only visible within Student class
	
	private int id;
	
	public String dept ;  // default

	public Student(String name, int id, String dept) {
			this.name = name;
			this.id = id;
			this.dept = dept;
	}
	
	private void view() {
		System.out.println(this.name + " " + this.id + " " + this.dept);
	}
	
	// getter and setter
	
	public String getName() {
		return this.name;  
	}
	
	public Integer getId() {
		return this.id;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}