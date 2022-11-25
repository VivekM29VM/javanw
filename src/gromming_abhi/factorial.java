package gromming_abhi;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// program to display factorial of a given number
			int num=5;
			int fact=1;
			
			for(int i=num;i>=1;i--)
			{
				fact=fact*i;
			}
              System.out.println(fact);
			}

}
