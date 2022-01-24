//checking if two numbers are equal

import java.util.Scanner;
public class Challenge {
	public static boolean isEqual(int num1, int num2) {
		if(num1==num2)
			return true;
		else
			return false;
  }
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		boolean result=isEqual(n1, n2);
		System.out.print(result);
	}
}