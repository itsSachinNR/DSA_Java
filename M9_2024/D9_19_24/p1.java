// factorail numb

package D9_19_24;

public class p1 {
    public static void printFac(int n, int fac) {
        if(n==1){
            System.out.println(fac);
            return;
        }
        fac*=n;
        printFac(n-1, fac);

    }


    public static void main(String[] args) {
        printFac(4,1 );
    }
}
