// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.


package practice;

import java.util.Scanner;

public class fibon {

    public static void fibonacci(int n) {
        int a[]=new int[n];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<n;i++){
             a[i]=a[i-1]+a[i-2];
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=s.nextInt();
        fibonacci(n);
    }
}
