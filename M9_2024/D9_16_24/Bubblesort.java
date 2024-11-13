package D9_16_24;

public class Bubblesort {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
         
    }
    public static void main(String[] args) {
        int arr[]={2,8,3,1,5};
        // bubble sort
        // time complexity=o(n^2)
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
         printArr(arr);
       
    }
}
