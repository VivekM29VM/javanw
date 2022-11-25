package gromming_abhi;

import java.util.Scanner;

public class prime1to1000 {

	public static void main(String[] args) {
		 PrintPrime(1000);
			
			
		}
		public static void PrintPrime(int count) {
		
		
		{  
			for(int k=2;k<=count;k++)
			{

			boolean flag=true;
			
			for(int i=2;i<=k/2;i++)

			
			{
				
				if(k%i==0)
				{  
					flag=false;
					break;
				
				}
				}
			
			if(flag)
				System.out.println(k);
			
		}
		}
}
}