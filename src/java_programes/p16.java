package java_programes;

public class p16 {

	public static void main(String[] args) {
		// swap 1st and last digit of array
		
		int[]a= {1,2,3,4,5};
		int temp=a[0];
		a[0]=a[4];
		a[4]=temp;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
