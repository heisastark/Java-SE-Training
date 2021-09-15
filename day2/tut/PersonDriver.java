package day2.tut;

class Person{
	String name;
	
	Integer age;
}
public class PersonDriver {

	public static void main(String[] args) {
		
		Person obj1 = new Person();// default constructor-> Integer=0, String=null
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
	}

}
