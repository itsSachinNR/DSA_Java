package D9_16_24;

public class InsertionSort {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }    
    }


    public static void main(String[] args) {
        int[] arr={3,6,1,9,7,2};

        // insertion sorting
        // time complexity=o(n^2)
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=current;
        }

        printArr(arr);
    }
}
