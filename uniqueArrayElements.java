//printing unique values from an integer array

// 5
// 2 2 2 2 2

// 2


import java.util.*;
import java.util.Scanner;

class uniqueArrayElements {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int n;
       n=s.nextInt();
       int[] arr=new int[n];
       int i, j;
       for(i=0; i<n; i++){
           arr[i]=s.nextInt();
       }
       int[] temp=new int[n];
       int tmp;
       for(i=0; i<n; i++){
           for(j=0; j<(n-i-1); j++){
               if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
               }
           }
       }
       for(i=0; i<n; i++){
           System.out.print(arr[i]+"\t");
       }
       System.out.println();
       for(i=0; i<n; i++){
            while(i<n-1 && arr[i]==arr[i+1]){
                i++;
            }
            System.out.print(arr[i]+"\t");
           }
       }
}