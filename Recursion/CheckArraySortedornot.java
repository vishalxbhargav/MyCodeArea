package Recursion;

public class CheckArraySortedornot {
    public static boolean check(int nums[],int i){
        if(i==nums.length-1) return true;
        if(nums[i]>nums[i+1]) return false;
        return (check(nums,i+1));
    }
    public static void main(String[] args) {
        int nums[]={1,3,4,6,8,9,12};
        System.out.println(check(nums,0));//output-true
        int nums1[]={1,3,4,6,9,1};
        System.out.println(check(nums1,0));//output-false
    }
}
