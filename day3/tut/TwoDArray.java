package day3.tut;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
			
		Integer arrayName[][] = new Integer[2][2]; 

		arrayName[0][0] = 1;
		arrayName[0][1] = 2;
		arrayName[1][0] = 3;
		arrayName[1][1] = 4;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2; j++) {
				System.out.println(arrayName[i][j]);
			}
		}
/*
 * 
 * initialization done once
 * condition---> true---stmt --- ince/decre
 *   |----false--out of loop
 */
		/*             a[i][j]
		 * i=0   j=0   a[0][0]
		 * i=0   j=1   a[0][1]  
		 *   i=0   j=2   2<2==> false
		 *   
		 *   
		 *   i=1  j=0  0<2   a[1][0]  
		 *   i=1 j=1   1<2   a[1][1]
		 *   i=1   j=2  2<2 ==> false
		 *   
		 *   i=2  2<2 ==> false
		 */
		
		//*************************************************************************
		
		String s[] = {"hello","hai","welcome"};
		
		System.out.println(Arrays.toString(s));
		
		System.out.println(Arrays.deepToString(arrayName));
	}

}
