// to find the given number is 2to power or not

package D9_16_24;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        int c=0;
        for(int i =1;i<=n;i++){
            if((Math.pow(2, i))==n){
                c++;
            }
        }
        if(c>0){
            System.out.println("it is a power of 2");
        }else{
            System.out.println("it is not a power of 2");
        }
    }
    
}
