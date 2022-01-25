// iterative and recursive method of finding factorial of a number
import java.util.Scanner;
import java.util.*;

public class iterRecFactorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num;
        System.out.print("enter a NUMBER:");
        num=s.nextInt();
        i_fac(num);
        r_fac(num, 1, 1);
    }
    public static void i_fac(int num){
    int i, fac=1;
    for(i=1; i<=num; i++){
        fac*=i;
    }
    System.out.println("iterative---factorial:"+fac);
}

public static void r_fac(int num, int i, int fac){
    fac*=i;
    i++;
    if(i<num){
        r_fac(num, i, fac);
    }
    if(i==num){
        fac*=num;
    System.out.print("recursive---factorial:"+fac);
    }
}
}
