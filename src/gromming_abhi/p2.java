package gromming_abhi;
//*write a programe to swap 2 numbers  using temporary variable
public class p2 {
public static void main(String[] args) {
	int a=100;
	int b=300;
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println(a);
	System.out.println(b);
}
}
