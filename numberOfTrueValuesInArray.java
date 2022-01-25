//counting number of true values in an array

import java.util.Scanner;

public class numberOfTrueValuesInArray {
	public static int countTrue(boolean[] arr) {
		int i, count=0;
		int n=arr.length;
		if(n==0)
		{
			return 0;
		}
		for(i=0; i<n; i++)
		{
			if(arr[i]==true)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		boolean[] arr;
		int n=s.nextInt();
		arr = new boolean[n];
		int count=countTrue(arr);
		System.out.print(count);
	}
}