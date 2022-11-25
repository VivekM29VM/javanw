package Array_programs;

import java.util.Arrays;

//program to find the largest ,2nd largest,3rd largest and smallest number in a  array

public class largestArray {
	public static void main(String[] args) {
		
	
	
	int[]a= {10,40,60,20,30,25};
	Arrays.sort(a);
	// for largest number
	System.out.println(a[a.length-1]);
	System.out.println(a[a.length-2]);
	System.out.println(a[a.length-3]);
	
	//for smallest number
	
	System.out.println(a[0]);
	
	
	}
	
	

}
