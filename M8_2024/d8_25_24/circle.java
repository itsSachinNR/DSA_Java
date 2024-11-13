// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class circle {

    public static void circle(int r) {
        float cic=(float) (2*3.14*r);
        System.out.println(cic);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the radius");
        int r=s.nextInt();
         circle(r);
    }
}
