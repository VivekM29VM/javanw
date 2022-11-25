package Array_programs;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[]a) 

	{
			for(int i=0;i<a.length;i++)
			
		{ 	
				for(int j=1;j<a.length-i;j++)
			{ 
					if(a[j-1]>a[j])
				{	
					a[j-1]=a[j-1]+a[j];
					a[j]=a[j-1]-a[j];
					a[j-1]=a[j-1]-a[j];
					
			    }
			
		   }	
		}
	}
				public static void main(String[] args) 
				{	
					int[] a= {40,20,15,10};
					bubbleSort(a);
					
					System.out.println(Arrays.toString(a));
			}
	
	
	}


