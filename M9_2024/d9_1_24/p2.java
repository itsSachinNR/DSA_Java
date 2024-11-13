// check the array is in asscending order or not

package d9_1_24;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        System.out.println("enter the array");
        int [] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++){
                if(num[i]>num[i+1]){
                    count++;
                }
        }
        if(count==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
