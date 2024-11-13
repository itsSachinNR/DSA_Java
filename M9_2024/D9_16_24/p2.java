package D9_16_24;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args){
         Scanner s=new Scanner(System.in);
         int arr[]={2,3,6,0,1,9};
         
         int c=0;
         for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
         }

         if(c==0){
            System.out.println("False");
         }
         else{
            System.out.println("True");

         }

    }
}
