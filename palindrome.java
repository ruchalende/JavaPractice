//to check if string is palindrome or not
import java.util.Scanner;
import java.util.*;
public class palindrome
{
	public static void main(String[] args) {
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		int i, j, n, flag=0;
		n=str.length();
		int[] arr=new int[n];
		for(i=0; i<n; i++){
		    arr[i]=str.charAt(i);
		}
	    for(i=0; i<n; i++){
	        if(arr[i]==arr[n-i-1])
	            flag=1;
	    }
	    if(flag==1){
	            System.out.print("STRING IS A PALINDROME");   
		}
		else
		    System.out.print("STRING IS NOT A PALINDROME");
	}
}
