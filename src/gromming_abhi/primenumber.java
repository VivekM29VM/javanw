package gromming_abhi;

import java.util.Scanner;

// program to check wheather the number is prime number
public class primenumber {
 public static void main(String[] args) {
 Scanner scn=new Scanner(System.in);
 System.out.println("enter the number");
		

	int num=scn.nextInt();
	isPrime(num);
}
public static void isPrime(int num)
{

	boolean flag=true;
	for(int i=2;i<=num/2;i++)

	
	{
		
		if(num%i==0)
		{  
			flag=false;
			break;
		
		}
		}
	
	if(flag)
		System.out.println("it is a prime number");
	else
		System.out.println("it is not a prime number");
}
}
