// Write a function which takes in 2 numbers and returns the greater of those two.

package practice;
import java.util.Scanner;

public class great {

    public static void greater(int a, int b) {
        if(a<b){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a : ");
        int a=s.nextInt();
        System.out.println("enter b : ");
        int b=s.nextInt();
        greater(a, b);
    }
}
