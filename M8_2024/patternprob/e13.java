//     1
//    212
//   32123
//  4321234
// 543212345





package M8_2024.patternprob;
public class e13 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n - i + 1; k > 0; k--) {
                System.out.print(k);
            }
            for(int l=2;l<=n-i+1;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
