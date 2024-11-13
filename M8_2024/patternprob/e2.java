// *****
// *   *
// *   *
// *****

package M8_2024.patternprob;
public class e2 {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        for (int i = 0; i < m; i++) {
            if (i == 0 || i == m - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < n; j++){
                    if(j==0 || j==n-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }

        }

    }
}
