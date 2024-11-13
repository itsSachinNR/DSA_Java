// Write a function to print the sum of all odd numbers from 1 to n.

package practice;
import java.util.Scanner;

public class sum {

    public static void sum(int n) {
        int s=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
               s+=i; 
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
    int n=s.nextInt();
    sum(n);
    }
    
}
