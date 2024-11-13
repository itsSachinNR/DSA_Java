// print the min and max numbers in an array

package d9_1_24;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        System.out.println("enter the array");
        int [] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=s.nextInt();
        }
        int max=0;
        int min=num[0];
        for(int i=0;i<n;i++){
            if(max<=num[i]){
                max=num[i];
            }
            if(min>=num[i]){
                min=num[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
