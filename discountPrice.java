//finding price after discount 

import java.util.Scanner;
import java.lang.Math;

public class discountPrice {
	public static double discount(int price, int percentage) {
		int discount=(price*percentage)/100;
		double final_price=price-discount;
		double cost= Math.round(final_price*100)/100;
		return cost;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int price=s.nextInt();
		int percentage=s.nextInt();
		System.out.print(discount(price, percentage));
	}
} 