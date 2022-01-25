//finding index of substring if present in another string
import java.util.Scanner;
import java.util.*;
public class indexOfSubstring
{
	public static void main(String[] args) {
		String str1, str2;
		Scanner s=new Scanner(System.in);
		str1=s.nextLine();
		str2=s.nextLine();
		int n1, n2, i, j;
		n1=str1.length();
		n2=str2.length();
		int n=str1.indexOf(str2);
		System.out.print(n);
		//returns -1 if substring not found
	}
}
