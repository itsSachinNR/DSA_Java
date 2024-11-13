// fibonacci series 

package M9_2024;

public class fib {
    public static void fibonacci(int n) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(i==0 || i==1){
                arr[i]=i;
            }else{
               int x=arr[i-2];
               int y=arr[i-1];
               arr[i]=x+y;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        fibonacci(7);
    }
    
}
