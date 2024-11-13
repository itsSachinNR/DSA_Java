package d9_1_24;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n:");
        int n=s.nextInt();
        System.out.println("enter m:");
        int m=s.nextInt();
        System.out.println("enter the array");
        int [][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
