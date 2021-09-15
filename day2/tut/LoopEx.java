package day2.tut;

public class LoopEx {

	
	public static void main(String[] args) {
	
	Integer nos[]={10,20,30,40,50};
    //              0  1  2  3  4
	for(Integer i : nos) // collection based loop
		System.out.println(i);

	System.out.println();
	
	
	for(int i=0; i<=4; i++)  //display natural order  - condition based access
	System.out.println(nos[i]);
/*
 * initialization - only once
 * 
 * condition--> True--> stmts ---->    Ince/Decre ------condition
 * 		|-----> False--> comes of Loop
 * 
 * i=0 
 * 
 * 0<=4 ---> T---> nos[0]==> 10  ---> i=1----- 1<=4--- T--nos[1]===> 20------i=4-- 4<=4--t--> nos[4]==>50--i=5--> 5<=5--->False
 */
	
	for(;;) {
		System.out.println("True");
		break;// --> exit out of a loop
	 }
	
	
	for(int i=1;i<nos.length;i++) {
		if(i==2)
			continue; // skips the remaining part of current iteration and it proceeds with other iteration
		else
			System.out.println(i);
	  System.out.println("Hello "+ i);
	}
	
	System.out.println("Length :"+ nos.length); // to find size of an array
	/*
	 * Expected output
	 * 
	 * 1
	 * 3
	 * 4
	 */
	
	}

}
