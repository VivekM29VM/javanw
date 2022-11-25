package java_programes;

import java.util.Scanner;

public class p11 {
	
	//programe to read the radius and find the area and perimeter of a circle
	
	public static void main(String[] args) {
		// programe to find the sum of a given number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of the circle");
		
		int radius=sc.nextInt();
		double area=3.14*(radius*radius);
		double perimeter=2*(3.14*radius);
		System.out.println("the area of given circle is "+area);
		System.out.println("the perimeter of given circle is"+perimeter);
      

	}
    }
