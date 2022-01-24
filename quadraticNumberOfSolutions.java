import java.util.Scanner;

public class Challenge {
	public static int solutions(int a, int b, int c) {
		int solution=0;
		int exp=(b*b) - (4*a*c);
		if((b!=0 && c!=0) || (b!=0 && c==0))
		{
			solution=2;
		} else if(a!=0 && b==0 && c==0)
		{
			solution=1;
		} else if(b==0 && c>0)
		{
			solution=0;
		} else if(c<0 && b==0)
		{
			solution=2;
		} else if(a==0 && b!=0 && c!=0)
		{
			solution =1;
		}
		if (exp==0)
		{
			solution=1;
		} else if(exp<0)
		{
			solution=0;
		} else if(exp>0)
		{
			solution=2;
		}
		return solution; 
  }
	public static void main(String[] args)
	{
		int num1, num2, num3;
		Scanner s=new Scanner(System.in);
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		int result = solutions(num1, num2, num3);
		System.out.print(result);
	}
}