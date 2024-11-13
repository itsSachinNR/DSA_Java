// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15


package M8_2024.patternprob;
public class e8 {
    public static void main(String[] args) {
        int a = 1;
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
