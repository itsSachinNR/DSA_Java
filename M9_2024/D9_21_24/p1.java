//print x^n using recursion (stack height =n)

package M9_2024.D9_21_24;

public class p1 {
    public static int PriXToPowN(int x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xtnm1=PriXToPowN(x,n-1);
        int xtn=x*xtnm1;
        return xtn;
    }
    public static void main(String[] args) {
        System.out.println(PriXToPowN(2, 3)); }
}
