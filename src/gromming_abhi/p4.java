package gromming_abhi;
//*write a programe to reverse a number

public class p4 {

	public static void main(String[] args) {
		int num=143;
		int x=num;
		int rev=0;
		int temp;
		
		while(x>0)
		{
			temp=x%10;
			rev=(rev*10)+temp;
			x=x/10;
		}
		System.out.println(rev);
	}
	

}
