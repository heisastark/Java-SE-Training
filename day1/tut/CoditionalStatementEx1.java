package day1.tut;

import java.util.Scanner;

public class CoditionalStatementEx1 {

	public static void main(String[] args) {
		
		int age= 100;
	/*	if(age<18) // 10<18===> true
			System.out.println("Not Eligible To Vote");
 */
 /*		
		if(age<18) // 10>18===> false
			System.out.println("Not Eligible To Vote");
		else {
			System.out.println("Elligible to vote");
		}
*/
		/*
		 * read two partition name and Partition size as input from user
		 * 
		 * calculate total partitions size
		 * 
		 * check whether it is less than disk size (Total Disk Size= 1000) 
		 * 
		 * display "Insufficient disk space" if size exceeds remaining
		 * 
		 * display "partition Done" if size is within limit
		 * 
		 */
		
		int total=1000;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Partition Name");
		
		String disk1= in.next();
		
		System.out.println("Enter Partition Size");
		
		int size1= in.nextInt();
		
		
		//===================================
		
		
		System.out.println("Enter Partition Name");
		
		String disk2= in.next();
		
		System.out.println("Enter Partition Size");
		
		int size2= in.nextInt();
		
		int totalPartitionSize= size1+size2;
		
		if(totalPartitionSize< total)
			System.out.println("Partition Done");
		else
			System.out.println("InSufficient Disk Space");
	}

}
