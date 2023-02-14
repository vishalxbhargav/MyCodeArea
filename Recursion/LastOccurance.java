package Recursion;

public class LastOccurance {
    public static int occurance(int nums[],int key ,int i){
        if(i==nums.length){
            return -1;
        }
        int isFound=occurance(nums, key, i+1);
        if(isFound==-1&&key==nums[i]) return i;
        return isFound;
    }
    public static void main(String[] args) {
        int nums1[]={1,3,4,6,5,9,5,1};
        System.out.println(occurance(nums1,1,0));//output-7
    }
}
