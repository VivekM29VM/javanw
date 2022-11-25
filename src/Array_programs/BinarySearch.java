package Array_programs;

import java.util.Arrays;

public class BinarySearch {
	
	public static void BinarySearch (int[]a,int key) 
	{
		int first =0;
		int last =a.length-1;
		int mid =(first+last)/2;
		
		
		while(first<=last)
	{  
			if(key<a[mid])
			{  
				last = mid-1;
			}
			
			else if(key==a[mid])
			{  
				System.out.println(key+ "is found at arrays index="+mid);
				break;
			}
			
			else if(key>a[mid])
			{
				first =mid+1;
				
			}
			
			mid =(first+last)/2;
	}
			
		if(first>last)	
		{
			System.out.println(key+"is not found at arrays index");
			
			
		}
	}

	public static void main(String[] args) 
	{
		int[]x= {10,80,55,60,40};
		Arrays.sort(x);
		BinarySearch(x, 40);
	}
}
