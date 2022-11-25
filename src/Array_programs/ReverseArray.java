package Array_programs;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		int j=a.length;
		
		for(int i=0;i<a.length/2;i++)
		{
			a[i]=a[i]+a[j-i-1];
			a[j-1-i]=a[i]-a[j-i-1];
			a[i]=a[i]-a[j-i-1];
			
		}
			System.out.println(Arrays.toString(a));	
		
		
	}

}
