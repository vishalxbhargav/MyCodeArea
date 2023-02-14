public class checkarraysortedandrotated {
    public static boolean check(int nums[]){
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }
        if(nums[0]<nums[nums.length-1]){
            count++;
        }
        return count<=1;

    }
    public static void main(String[] args) {
        int nums1[]={2,3,4,5,1,6};
        int nums2[]={1,2,3,4,5,6,7,8,9,10};
        if(check(nums1)){
            System.out.println("Given  array sorted and rotated");
        }else{
            System.out.println("Given is't array sorted and rotated");
        }
        if(check(nums2)){
            System.out.println("Given  array sorted and rotated");
        }else{
            System.out.println("Given is't array sorted and rotated");
        }

    }
    
}
