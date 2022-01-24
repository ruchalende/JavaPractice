//converting minutes to seconds

import java.util.Scanner;
public class Challenge {
	public static int convert(int minutes) {
		int seconds=0;
		seconds=minutes*60;
		return seconds;
  }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int s=convert(m);
		System.out.println(s);
	}
}