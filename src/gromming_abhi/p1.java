package gromming_abhi;

import java.util.Scanner;

//*write a programe to read 3 integer values and then find the greatest among 3?

public class p1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//reads the data dynamically from the user
	
	System.out.println("enter the 1st value");
	int a=sc.nextInt();
	
	System.out.println("enter the 2nd value");
	int b=sc.nextInt();
	
	System.out.println("enter the 3rd value");
	int c=sc.nextInt();
	
	if(a>b&&a>c)
		System.out.println(a+" is the greatest no");
	
	else if (b>c)
		System.out.println(b+" is the greatest no");
	else
		System.out.println(c+" is the greatest no");
}
}
