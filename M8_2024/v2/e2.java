//print all the even till n
package M8_2024.v2;
import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the n");
      int n=s.nextInt();
          for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
          }
    }
}
