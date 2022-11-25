package gromming_abhi;

public class fibonassirecurssion {

	static int n1=0;
    static int n2=1;
	static int n3;
    public static void fibonacci(int count)
    {  
    	if(count>0)
    	{
    		n3=n1+n2;
    		System.out.print(","+n3);
    		n1=n2;
    		n2=n3;
    		fibonacci(count-1);
    	}
    }
	 public static void main(String[] args) 
	 {
		
		int count=10;
		System.out.print(n1+","+n2);
		fibonacci(count-2);
	}
		
	}


