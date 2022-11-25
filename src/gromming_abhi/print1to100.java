package gromming_abhi;

public class print1to100 {
	// program to print numbers from 1-100 without using any loop

	public static void Printnumber(int num) {
		if(num<=0)
		{
			return;
		}
		else
		{
        Printnumber(num-1);
        System.out.print(num+",");
	}

}
	public static void main(String[] args) {
		Printnumber(100);
	}
}