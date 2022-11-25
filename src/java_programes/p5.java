package java_programes;

import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		// program to display factors of a given number
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		
		
		int a=sc.nextInt();
		 
	    for(int i=1;i<=a;i++) {
			 
	    if(a%i==0) {
				
				System.out.println(i);
			}
		}
	}

}
