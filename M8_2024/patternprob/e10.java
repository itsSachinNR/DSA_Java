// 1
// 01
// 101
// 0101
// 10101


package M8_2024.patternprob;
public class e10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
               if(i%2==0){
                if(j%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
               }else{
                if(j%2==0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
               }

                // System.out.print("j");
            }
            System.out.println();
        }
    }
}
