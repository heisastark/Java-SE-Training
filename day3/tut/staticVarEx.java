package day3.tut;

class Session{
	
	static int counter=0;
	
	public Session() {
		counter++;
	}
}

public class staticVarEx {

	public static void main(String[] args) {
		
		new Session();
		Session a1 = new Session();
		new Session();
		new Session();
		new Session();
		new Session();
		
		System.out.println(Session.counter);

	}

}
