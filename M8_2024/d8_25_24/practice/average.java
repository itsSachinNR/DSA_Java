// Enter 3 numbers from the user & make a function to print their average.



package practice;

import java.util.Scanner;

public class average {


    public static void average(int a, int b , int c) {
       int aver=(a+b+c)/3;
       System.out.println(aver);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a :");
        int a=s.nextInt();
        System.out.println("enter b :");
        int b=s.nextInt();
        System.out.println("enter c :");
        int c=s.nextInt();
        average(a, b, c);
    }

}
