package Array_programs;

public class ArrayProduct {

	public static void main(String[] args) {
		int []a= {10,50,45,60,77};
		int product=1;
	
		for (int i = 0; i < a.length; i++) 
		{
			product=product*a[i];
		}
		
		System.out.println(product);
	}

}
