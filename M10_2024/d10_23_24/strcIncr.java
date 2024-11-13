package d10_23_24;

// storing curr=a[n]
// next=a[n+1]
//checking it is greater or not
//if it is not greater we just return
//or else we continue

public class strcIncr {
    public static void strictlyIncreasing(int arr[],int ind) {
        if(ind==arr.length-1){
            System.out.println("valid");
            return;
        }
        int curr=arr[ind];
        int next=arr[ind+1];
        if(curr>=next){
            System.out.println("invalid");
            return;
        }
        strictlyIncreasing(arr, ind+1);
    }


    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,2,4,5};
        int arr3[]={1,2,9,4,5};
        strictlyIncreasing(arr1, 0);
    }
}
