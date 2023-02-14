package Recursion;

public class MergeSort {
    public static void solve(int arr[],int s,int e){
        if(s>=e) return;
        int mid=s+(e-s)/2;
        solve(arr, s, mid);
        solve(arr, mid+1, e);
        merge(arr,s,mid,e);
        return;
    }
    public static void merge(int[] arr, int s, int mid, int e) {
        int temp[]=new int[e-s+1],i=s,j=mid+1,k=0;
        while(i<=mid&&j<=e){
            if(arr[i]<arr[j])    temp[k++]=arr[i++];
            else    temp[k++]=arr[j++];
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }    
        while(j<=e){
            temp[k++]=arr[j++];
        }   
        for(k=0,i=s;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }    
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8,-1};
        for(int i=0;i<arr.length;i++) System.out.print(" "+arr[i]);
        solve(arr, 0, arr.length-1);
        System.out.println();
        for(int i=0;i<arr.length;i++) System.out.print(" "+arr[i]);

    }
}
