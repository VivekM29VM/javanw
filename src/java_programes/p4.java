package java_programes;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		// programe to display factorial of a given number
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		
		int a=scn.nextInt();
		int b=1;
		
		for(int i=a;i>=1;i--) {
			 b=b*i;
			}
		    
		System.out.println("the factorial of" + a + "is" + b);

	}

}
