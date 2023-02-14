public class peckofMountan {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 1;
        int end = arr.length-2;
        int ans=0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1]){
                ans = mid;
                break;
            }
            else if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else if(arr[mid]<arr[mid-1]){
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 10, 5, 2 };
        int result = peakIndexInMountainArray(arr);
        System.out.println(result);
    }
}
