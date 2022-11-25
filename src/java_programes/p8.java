package java_programes;

import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
		// programe to check wheather a number is a palindrome
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int a=sc.nextInt();
		
		int temp=a;
		String rev="";
		for(int i=0;temp>0;i++) {
			rev=rev+temp%10;
			temp=temp/10;
		}
		
		int b=Integer.parseInt(rev);
		
		if(b==a) {
			System.out.println("it is a palindrome");
			
		}
		
		else
			System.out.println("it is not a palindrome");

	}

}
