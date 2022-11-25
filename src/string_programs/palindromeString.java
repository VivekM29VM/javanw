package string_programs;

public class palindromeString {
	
	//program to check wheather a string is palindrome
	public static void main(String[] args)
	
	{
		String s="ABCBA";
		boolean flag=true;
		
		for (int i = 0,j=s.length()-1; i<s.length()/2;i++,j--) 
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("it is a palindrome");
		
		else
			System.out.println("it is not a palindrome");
	}

}
