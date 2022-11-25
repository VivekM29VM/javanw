package java_programes;

import java.util.Scanner;

public class p15 {

	public static void main(String[] args) {
		// programe to add elements into the array by taking dynamic input
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		
	   int size =sc.nextInt() ;
	   int[]a=new int[size];
	   
	   for(int i=0;i<a.length;i++) {
		   a[i]=sc.nextInt();
		   
	   }
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
