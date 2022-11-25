package java_programes;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		
		// program to display sum of 1st n natural numbers
		 
		Scanner scn = new Scanner(System.in);
		 
		System.out.println("enter the number");
		 
		int a=scn.nextInt();
		 
		int total=0;
		 
		for(int i=0;i<=a;i++) {
			 total=total+i;
			}
	
		 System.out.println("the sum of first n natural numbers"+total);
		
		

	}

}
