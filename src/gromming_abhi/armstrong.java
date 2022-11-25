package gromming_abhi;

public class armstrong {
//program to check wheather a number is an armstrong number
	public static void main(String[] args) {
		
		int num=153;
		int x=num;
		int temp;
		int y=0;
		
		while(x>0) {
			temp=x%10;
			y=y+(temp*temp*temp);
			x=x/10;
			}
	
		if(y==num)
			System.out.println("it is an armstrong number");
		else
			System.out.println("it is not an armstrong number");
		
		
	}

}
