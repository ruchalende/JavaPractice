import java.util.Scanner;
public class triangularNumberSequence {
	public static int triangle(int n) {
		int i, dots=0;
		for(i=1; i<=n; i++)
		{
			dots+=i;
		}
		return dots;
  }
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(triangle(n));
	}
}