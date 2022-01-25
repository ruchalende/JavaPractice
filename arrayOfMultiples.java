//printing array of multiples from a number of given array length

import java.util.*;

public class arrayOfMultiples{
	public static int[] arrayOfMultiples(int num, int length) {
		int[] arr = new int[length];
		arr[0]=num;
		int i;
		for(i=1; i<length; i++)
		{
			int a = i+1;
			arr[i] = num*a;
		}
		return arr;
	}
	public static void main(String[] args)
	{
		int num, length;
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
		length=s.nextInt();
		arrayOfMultiples(num, length);
	}
}