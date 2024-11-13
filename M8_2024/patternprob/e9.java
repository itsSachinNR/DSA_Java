// 1 
// 0 1
// 0 1 0
// 1 0 1 0
// 1 0 1 0 1



package M8_2024.patternprob;
public class e9 {
    public static void main(String[] args) {
        int a = 1;
        int b=0;
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
               if(a%2==0){
                System.out.print("0 ");
               }else{
                System.out.print("1 ");
               }
               a++;
            }
            System.out.println();
        }
    }
}
