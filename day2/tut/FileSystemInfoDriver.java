package day2.tut;

import java.util.Scanner;

/*Ex:
 *  
 * Expected output
===============

Enter the File System ftype
ext3
Enter the File System fmount
/D1
Enter the File System fsize
100
Partition Done


Enter the File System ftype
xfs
Enter the File System fmount
/D2
Enter the File System fsize
2000

Insufficient disk space

 * 
 * 
 */


class FileSystemInfo{
	String fstype;
	String fmount;
	Integer fsize;
	
	static Integer totalSize = 1000;
	
	// create a method called getFileSystemInfo() accepts fstype, fmount,fsize from user.
	
	void getFileSystemInfo() {
		int size; // local var
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the File System Type");
		fstype = in.next();
		

		System.out.println("Enter the File System mount Point");
		fmount = in.next();
		

		System.out.println("Enter the File System size required");
		size = in.nextInt();
		
		allocateSpace(size); // method call
		
	}
	
	/*create a method allocateSpace(int fsize) and compare it with totalSize.
	If fsize is less than the totalSize,print "partition done" and decrement totalSize
	If fsize is more totalSize, print "Insufficient disk space"

	 */                  //   2000
	void allocateSpace(int size) {
		// 2000<600
		if(size<totalSize) { // size<totalSize?true:false
			fsize=size;
			FileSystemInfo.totalSize -= size; // i-=10 ===>  i=i-10  totalSize= totaSize-size  = 600
			System.out.println("Partition Done");
		}
		else {
			System.out.println("Insufficient disk space");
		}
	}

}

public class FileSystemInfoDriver {

	public static void main(String[] args) {
		
		FileSystemInfo fs1 = new FileSystemInfo();
		fs1.getFileSystemInfo();
		
		System.out.println();
		
		FileSystemInfo fs2 = new FileSystemInfo();
		fs2.getFileSystemInfo();// getFileSystemInfo(fs2)

	}

}
