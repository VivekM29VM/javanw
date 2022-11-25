package string_programs;

public class RepeatedCHstring {
	//program to find the repeated characters present in a String

	public static void main(String[] args) {
		
		String s="ANAMIKA";
		
		char[]ch=s.toCharArray();
		
		for (int i = 0; i<ch.length; i++) {
			
			int Count=1;
			
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					
					Count++;
					ch[j]='0';
				}
				
			}
			if(Count>1 && ch[i]!='0')
				
				System.out.println(ch[i]);
		}
		
	}
}
