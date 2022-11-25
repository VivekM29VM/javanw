package gromming_abhi;

import java.util.Scanner;

public class strongNumber {
	public static void main(String[] args) {
		
	    int num=145;
		int x=num;
		int total=0;
		
		while(x>0)
		{
			int lastdigit=x%10;
			int factorial=1;
			
			for(int i=lastdigit;i>=1;i--)
		
		{
				factorial=factorial*i;
		
		}
			
			total=total+factorial;
			x=x/10;
	}
		
		if(total==num) {
			System.out.println("it is a strong number");
		}
		
		else
		{
			System.out.println("it is not a strong number");
			
		}	
		

	}
}

