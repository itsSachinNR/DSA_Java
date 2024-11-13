// sum of n natural number

package D9_19_24;

public class rec {
    public static void sumOfN(int n,int sum) {
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        sumOfN(n-1, sum);
        
    }

    public static void main(String[] args) {
        // int n=7;
        // int sum=0;
        sumOfN(9, 0);

    }
}
