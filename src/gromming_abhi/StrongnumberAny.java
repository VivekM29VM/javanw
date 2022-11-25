package gromming_abhi;

import java.util.Scanner;

public class StrongnumberAny {

	public static void main(String[] args) {
		// programe to find wheather a number is a strong number
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int a=sc.nextInt();
		
		int temp=a;
		int total=0;
		for(int i=1;temp>0;i++) {
			int c=1;
			int b=temp%10;
			for(int j=b;j>0;j--) {
				c=c*j;
			}
			
			temp=temp/10;
			total=total+c;
			}
		
		if(a==total) {
			System.out.println("it is a strong number");
		}
		
		else
		{
			System.out.println("it is not a strong number");
			
		}
		

	}

}


