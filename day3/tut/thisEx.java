package day3.tut;

class SystemInfo{
	String hostName;
	
	public SystemInfo(String hostName) {
		this.hostName=hostName; //hostName is instancevar/ class attr
	}
	
	void display() {
		System.out.println(this.hostName); // this refers to current object
	}
	
	void view() {
		System.out.println("Im inside View");
		this.display();// instance method call
		System.out.println("End of View");
	}
}


public class thisEx {  // java thisEx.java hello hai welcome  ==> new String[]{"hello"," hai"," welcome"} 

	public static void main(String[] args) {
	
		SystemInfo obj = new SystemInfo("HOST01");
		
	//	System.out.println(obj.hostName);
		
	//	obj.display();  // display(obj)
		
		obj.view();
		System.out.println("End of main");
	//	System.out.println(this.hostName);  access instance var from static method leads error
		
		System.out.println();
		
		
		System.out.println(args[0] +"\t"+ args[1] + "\t" + args[2]);
	}

}
