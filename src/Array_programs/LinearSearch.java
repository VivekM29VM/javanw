package Array_programs;

public class LinearSearch {

	public static int linearSearch(int[]a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if (a[i]==key)
			
			return  i;
			
		}
		
       return -1;
	}
  public static void main(String[] args) {
	
	  int[]x= {20,25,10,30,40};
	System.out.println(linearSearch(x,40));
}
}
