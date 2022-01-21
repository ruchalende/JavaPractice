//Given an array of distinct integers. 
//The task is to count all the triplets such that sum of two elements equals the third element.
import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    static int triplets(int[] a, int n)
    {
        int i, j, k, count=0;
        for(i=0; i<n; i++)
    	    {
    	        for(j=i+1; j<n; j++)
    	        {
    	            for(k=j+1; k<n; k++)
    	            {
    	                if(a[i]+a[j]==a[k] && i!=j)
    	                {    System.out.println(a[i]+"+"+a[j]+"="+a[k]);
    	                    count++;
    	                }
    	            }
    	        }
    	    }
        return count;
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		int n, i, j, k, count;
	    n=s.nextInt();
	    int[] arr=new int[n];
	    for(i=0; i<n; i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    Arrays.sort(arr);
	    count=triplets(arr, n);
	    System.out.println("There are "+count+" triplets.");
	}
}
