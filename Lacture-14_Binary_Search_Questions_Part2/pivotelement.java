public class pivotelement {

    public static int pivot(int arr[]){
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
        while (s < e)
        {
            if (arr[mid] >= arr[0])
            {
                s = mid + 1;
            }
            else
            {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[]={3,8,10,17,1};
        int nums[]={7,9,1,2,3};
        System.out.println(pivot(nums));
        int result=pivot(arr);
        System.out.println(result);
    }
}
