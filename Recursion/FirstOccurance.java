package Recursion;

public class FirstOccurance {
    public static int occurance(int nums[],int key ,int i){
        if(i==nums.length){
            return -1;
        }
        if(key==nums[i]) return i;
        return occurance(nums, key, i+1);
    }
    public static void main(String[] args) {
        int nums1[]={1,3,4,6,5,9,5,1};
        System.out.println(occurance(nums1,10,0));//output-1
    }
}
