package java_programes;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		// programe to find wheather a number is a prefect number
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		
		int a=sc.nextInt();
		
		int total=0;
		
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				
				total=total+i;
			}
		}
         if(total==a) {
        	 System.out.println("it is a perfect number");
         }
         else
        	 System.out.println("it is not a perfect number");
	}

}
