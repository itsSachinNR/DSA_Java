package D9_16_24;

public class Recursion {
    public static void printNum(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNum(n-1);
    }
    public static void main(String[] args) {
        printNum(6);
    }
}
