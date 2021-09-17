package day5.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) throws  TooLongLoadTimeException  {
	

		m1();

	}

	static void m1() throws TooLongLoadTimeException{
		
		  try { 
			  Scanner obj = new Scanner(new FileInputStream("D:\\emp.csv")); 
		  } catch(FileNotFoundException e) { 
			 // 	e.printStackTrace();
			  System.out.println("Exception handled");  // swallowing an exception
			  throw new TooLongLoadTimeException("Too long time to load",e); // new exception creates // wrap and throw
			  
			}
		 
		
		//		Scanner obj = new Scanner(new FileInputStream("D:\\emp.csv"));
	}
}


class TooLongLoadTimeException extends Exception{

	public TooLongLoadTimeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	
}