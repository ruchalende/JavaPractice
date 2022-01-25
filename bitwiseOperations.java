//performing bitwise operations AND, OR and XOR on two bitwise representation of numbers

import java.util.Scanner;
public class bitwiseOperations {
	public static int bitwiseAND(int n1, int n2) {
		int and=(n1 & n2);
		return and;
  }
	
	public static int bitwiseOR(int n1, int n2) {
		int or=(n1 | n2);
		return or;
  }
	
	public static int bitwiseXOR(int n1, int n2) {
		int xor=(n1 ^ n2);
		return xor;
  }
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println(bitwiseAND(n1, n2));
		System.out.println(bitwiseOR(n1, n2));
		System.out.println(bitwiseXOR(n1, n2));
	}
}