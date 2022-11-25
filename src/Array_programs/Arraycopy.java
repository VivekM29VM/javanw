package Array_programs;

import java.util.Arrays;

public class Arraycopy {

	//program to copy the elements of 1 array into another
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50};
		
		int[] b= new int[a.length];
		
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("********");
	}
	
	
}
