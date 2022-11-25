package java_programes;

public class p13 {

	public static void main(String[] args) {
		// programe to print fibonacci series of a given number
		int num=5;
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<=num;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
