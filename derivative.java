//finding derivative

import java.util.Scanner;
public class derivative {
	public static int derivation(int b, int m)
	{
	    int result=1, exp=b-1;
	    while(exp!=0)
	    {
	        result*=m;
	        --exp;
	    }
	    result*=b;
	    return result;
	    
	}
	public static void main(String[] args)
	{
	    
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		int m=s.nextInt();
	    System.out.print(derivation(b, m));
	}
}