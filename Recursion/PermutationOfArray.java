package Recursion;

public class  PermutationOfArray {
    public static void searchRange(int[] nums, int target) {
        int s=0,e=nums.length-1,mid;
        int ans[]={-1,-1};
        while(s<=e){
            mid=(e-s)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                while(nums[mid]==target){
                    mid++;
                }
                ans[1]=mid-1;
            } 
            else if(nums[mid]<target) s=mid+1;
            else e=mid-1;
        }
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
    public static void permutation(int arr[]){
        
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        searchRange(arr, 8);
    }    
}
