//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *


package M8_2024.patternprob;
public class e15 {
    public static void main(String[] args) {
        int n=4;
for(int i=0;i<n;i++){

    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }

    for(int j=0;j<2*i+1;j++){
        System.out.print("*");
    }
    System.out.println();
}

for(int i=n;i>=0;i--){

    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }

    for(int j=0;j<2*i+1;j++){
        System.out.print("*");
    }
    System.out.println();
}
















        // for(int i=n;i>0;i--){
        //     for(int j=0;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=n-i+1;j>0;j--){
        //         System.out.print("*");
        //     }
        //     for(int j=2;j<n-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<=n;i++){
        //     for(int j=i;j>=0;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<n-i+1;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=n-i+1;j>2;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}