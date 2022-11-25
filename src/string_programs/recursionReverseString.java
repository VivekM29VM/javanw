package string_programs;


//program to reverse a string using recurssion

public class recursionReverseString {
	
	String Str="java";
	
	public static String reverseString(String Str) {
		
		if(Str.isEmpty())
				return Str;
		
		else
			return(reverseString(Str.substring(1))+Str.charAt(0));
	}
  public static void main(String[] args) {
	System.out.println(reverseString("java"));
}
}
