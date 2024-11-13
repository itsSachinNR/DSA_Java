package d9_1_24;

import java.util.Scanner;

public class arrays2d {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the array");
        int [][] arr=new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("enter the element which you want find the index");
        int a=s.nextInt();
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                 if(a==arr[i][j]){
                    System.out.println(i+" "+j);
                 }
            }}
    }
}
