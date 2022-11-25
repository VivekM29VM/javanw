package gromming_abhi;

public class palindrome {
	public static void main(String[] args) {
		int num=43834;
		int x=num;
		int rev=0;
		int temp;
		
		while(x>0)
		{
			temp=x%10;
			rev=(rev*10)+temp;
			x=x/10;
		}
		if(num==rev)
			System.out.println("it is a palindrome");
		else{
		 System.out.println("it is not a palindrome");
	}
	}
}