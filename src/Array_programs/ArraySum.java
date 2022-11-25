package Array_programs;

public class ArraySum {

	public static void main(String[] args) {
		int []a= {10,50,45,60,77};
		int sum=0;
	
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}
	
}

