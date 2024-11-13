// fibonacci series using recurrsion

package M9_2024.D9_21_24;

public class fibo {

    public static void PriFibo(int a,int b, int n) {
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        PriFibo(b, c, n-1);
        
    }

    public static void main(String[] args) {
        int n=9;
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        PriFibo(a, b, n-2);

    }
    
}
