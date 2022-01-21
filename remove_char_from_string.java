//to remove any given character in a string
import java.util.Scanner;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str;
		char c;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		c=s.next().charAt(0);
		int i, j, n, flag=0;
		n=str.length();
		char[] arr=new char[n];
		char[] temp=new char[n];
		for(i=0; i<n; i++){
		    arr[i]=str.charAt(i);
		}
	    for(i=0; i<n; i++){
	        if(arr[i]!=c){
	            temp[i]=arr[i];
	        } 
	    } 
	    str="";
	    for(i=0; i<n; i++){
	        str=str+temp[i];
	    }
	    System.out.print(str);
	}
}