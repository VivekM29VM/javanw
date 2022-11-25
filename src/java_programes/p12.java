package java_programes;

import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {
		// programe to find armstrong number
		
		int num=153;
		int temp=num;
		int total=0;
		for(int i=0;num>0;i++) {
			int a=num%10;
			total=total+(a*a*a);
			num=num/10;
			
		}
             if(total==temp) {
            	 System.out.println("it is a armstrong number");
             }
             else
            	 System.out.println("it is  not a armstrong number");
	}

}
