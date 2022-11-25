package Array_programs;

public class anyduplicateArray {
public static void main(String[] args) {
		
		int[] a= {10,20,30,10,20,10,10,20,30};
		
		int[]duplicate= new int[a.length];
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
					duplicate[j]=-1;
					
			}
		}
                
		for (int i = 0; i < duplicate.length; i++) 
		{
			if(duplicate[i]==-1)
				System.out.println(a[i]);
		}
		

}
}