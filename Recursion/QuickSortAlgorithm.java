package Recursion;

public class QuickSortAlgorithm {
    public static void sorting(int arr[],int low,int high){
        if(low<high){
            int pidx=partitian(arr,low,high);
            sorting(arr, low, pidx-1);
            sorting(arr, pidx+1, high);
        }
        
    }
    public static int partitian(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        System.out.println();
        sorting(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
}
