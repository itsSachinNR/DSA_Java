// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *



package M8_2024.patternprob;
public class e14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<(n-i)*2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=n;i>=1;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            for(int j=(n-i)*2;j>0;j--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
System.out.println();    

        }
       
    }
}
