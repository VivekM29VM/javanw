package java_programes;

import java.util.Scanner;

public class p10 {

	public static void main(String[] args) {
		// programe to find the sum of a given number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int a=sc.nextInt();
		int b=0;
		while(a>0) {
			
			b=b+a%10;
			a=a/10;
			
		}
		
          System.out.println("the sum of the given number is"+b);
	}

}
