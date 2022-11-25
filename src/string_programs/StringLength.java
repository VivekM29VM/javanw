package string_programs;

public class StringLength {
	
	//program to find the length of a string without using inbuilt function

	public static void main(String[] args) 
	{
		String s="java";
		char[]ch=s.toCharArray();
		
		int Count=0;
		
		for(char lv:ch) {
			
			Count++;
		}
		System.out.println(Count);
	}
}
