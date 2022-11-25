package java_programes;

import java.util.Scanner;

public class p9 {
	
	public static void main(String[] args) {
		// programe to check wheather a number is a palindrome
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int a=sc.nextInt();
		
		int count=0;
		while(a>0) {
			
			a=a/10;
			count++;
		}
		System.out.println("the total count of the given number is"+count);
		
		}
        
        }
