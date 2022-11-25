package Array_programs;

import java.util.Arrays;

public class selectionSort {
	
	public static void SelectionSort(int[]a) 
	{
		for (int i = 0; i < a.length; i++)
		{
			int minIndex=i;
			
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]<a[minIndex])
				{
				
					minIndex=j;
				

			if(minIndex!=i)
		{
			 a[i]=a[i]+a[minIndex];
	      
	      a[minIndex]=a[i]-a[minIndex];
	      
	      a[i]=a[i]-a[minIndex];
	      
		}
		
		
    }
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		int[] a= {40,20,15,10};
		SelectionSort(a);
		
		System.out.println(Arrays.toString(a));
	}
		
	}