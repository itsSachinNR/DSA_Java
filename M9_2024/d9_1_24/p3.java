// Print the spiral order matrix as output for a given matrix of numbers. 

// its not done yet because im going to do it later.


package d9_1_24;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n:");
        int n=s.nextInt();
        System.out.println("enter m:");
        int m=s.nextInt();
        System.out.println("enter the array");
        int [][] arr=new int[n][m];



        for(int i=0;i<n;i++){
            arr[0][i]=s.nextInt();
        }

        for(int i=1;i<n-1;i++){
            arr[i][5]=s.nextInt();
        }

        for(int i=4;i>=0;i--){
            arr[4][i]=s.nextInt();
        }

        for(int i=3;i>0;i--){
            arr[i][0]=s.nextInt();
        }

       
    }
}
