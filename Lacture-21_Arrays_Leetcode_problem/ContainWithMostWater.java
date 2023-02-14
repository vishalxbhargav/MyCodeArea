public class ContainWithWater {
    public static int solve(int arr[]){
        int max=0,left=0,right=arr.length-1;
        while(left<right){
            int result=(right-left)*Math.min(arr[left], arr[right]);
            max=Math.max(max, result);
            if(arr[left]<arr[right]) left++;
            else right--;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(solve(arr));
    }
}
