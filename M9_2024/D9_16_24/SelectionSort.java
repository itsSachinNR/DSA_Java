package D9_16_24;

public class SelectionSort {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }}

    public static void main(String[] args) {
        int arr[]={7,3,6,9,2,5,1};
        // selection sorting
        // time complexity=o(n^2)  
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }

        printArr(arr);
    }
}
